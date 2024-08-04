package chocopie.example.woowangBE.repository;

import chocopie.example.woowangBE.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//회원조회, 중복회원조회
public interface MemberRepository extends JpaRepository<Member, Long> {
    //기존 회원가입 여부
    Boolean registerNewMember(Long accountId);

    //아이디랑 이메일 대조하기 위한 객체 생성
    Member findByAccountId(Long accountId);
    Member findByEmail(Long memberEmail);


}
