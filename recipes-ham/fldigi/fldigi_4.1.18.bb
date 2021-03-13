SUMMARY = "fldigi"

DESCRIPTION = "Fldigi is a software modem for Amateur Radio use. It is a sound \
card based program that is used for both transmitting and receiving data in \
various digital modes"

HOMEPAGE = "http://www.w1hkj.com/"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "http://www.w1hkj.com/files/fldigi/${BP}.tar.gz \
          "
SRC_URI[md5sum] = "8cdab5b504f28553ec3c1f50cbd2f801"
SRC_URI[sha256sum] = "3c7fd84ab3a84ba4525b251e9d56120daee626a3831684a974fdad476f90270d"

inherit autotools gettext

DEPENDS = "fltk libsamplerate0 portaudio-v19"
