# Meta-amateurradio

This layer is intended to add recipes for SDR packages, digital modes and other
software packages for amateur radio operators.

## Dependencies

This layer depends on:

* URI: http://git.yoctoproject.org/cgit/cgit.cgi/poky/
  * layer: `meta`
  * branches: `kirkstone`
* URI: http://git.openembedded.org/meta-openembedded
  * layer: `meta-oe`
  * branches: `kirkstone`

Optional dependencies:

* URI: https://github.com/meta-qt5/meta-qt5
  * layer: `meta-qt5`
  * branches: `kirkstone`
* URI: http://git.openembedded.org/meta-openembedded
  * layer: `meta-networking`
  * branches: `kirkstone`

## Issues & contributions

Please send your issues, patches and pull requests on the github repository, at
<https://github.com/adrians/meta-amateurradio>.

## Hints

* Previously the master-branch of this repository was maintained to be
compatible with `dunfell` release. The recipes for this
release have been moved to the `dunfell` branch, while the `master`
branch tracks the current `kirkstone` and `langdale` releases. This is due to the breaking
changes in the syntactic rules for the recipe introduced in the `honister`
release.

* Some digital modes (WSPR, FT8, etc.) require a synchronized system clock. If
the board does not have a synchronized RTC module but has an internet
connection, you might want to install `ntpdate` (from the `meta-networking`
layer).

* Some packages (WSJT-X, JS8Call) depend on fortran libraries, but the fortran
runtime is not enabled by default in the yocto project. You'll need to add the
following line to the `conf/local.conf` file:
```
FORTRAN:forcevariable = ",fortran"
```

* If using rtl-based sdr dongles, you might need to unload the `dvb_usb_rtl28xxu`
module from the kernel, as it is automatically inserted.
```bash
rmmod dvb_usb_rtl28xxu
```

* When starting direwolf, you need a configuration file in `~/direwolf.conf`
specifying the audio interface. Use `cm108` tool to identify the audio interface
and then create the file like this:
```bash
echo "ADEVICE plughw:0,0" > ~/direwolf.conf
```
