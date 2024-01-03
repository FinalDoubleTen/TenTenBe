package org.tenten.tentenbe.domain.auth.dto.response;

import lombok.Builder;
import org.tenten.tentenbe.domain.member.model.Member;

@Builder
public record MemberDto(
    Long id,
    String userName,
    String nickName,
    String email
) {
    public static MemberDto fromEntity(Member member) {
        return new MemberDto(
            member.getId(),
            member.getName(),
            member.getNickname(),
            member.getEmail()
        );
    }
}
