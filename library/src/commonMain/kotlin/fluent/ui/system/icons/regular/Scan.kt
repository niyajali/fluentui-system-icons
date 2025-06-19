package fluent.ui.system.icons.regular

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.Scan: ImageVector
    get() {
        if (_Scan != null) {
            return _Scan!!
        }
        _Scan = ImageVector.Builder(
            name = "Regular.Scan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                close()
                moveTo(15.25f, 14.332f)
                lineTo(15.212f, 14.404f)
                lineTo(15.148f, 14.495f)
                lineTo(10.391f, 20.348f)
                curveTo(10.912f, 20.448f, 11.45f, 20.5f, 12f, 20.5f)
                curveTo(14.171f, 20.5f, 16.152f, 19.686f, 17.654f, 18.347f)
                lineTo(15.57f, 13.806f)
                curveTo(15.477f, 13.99f, 15.37f, 14.166f, 15.25f, 14.332f)
                close()
                moveTo(4.49f, 15.985f)
                curveTo(5.427f, 17.747f, 6.965f, 19.139f, 8.83f, 19.889f)
                lineTo(11.991f, 16f)
                lineTo(11.8f, 15.995f)
                lineTo(11.669f, 15.986f)
                lineTo(4.49f, 15.985f)
                close()
                moveTo(20.13f, 9.512f)
                horizontalLineTo(15.132f)
                curveTo(15.214f, 9.615f, 15.29f, 9.721f, 15.362f, 9.832f)
                curveTo(15.386f, 9.859f, 15.409f, 9.889f, 15.429f, 9.921f)
                lineTo(15.478f, 10.01f)
                lineTo(15.517f, 10.093f)
                curveTo(15.603f, 10.251f, 15.679f, 10.416f, 15.743f, 10.586f)
                lineTo(18.759f, 17.155f)
                curveTo(19.851f, 15.725f, 20.5f, 13.938f, 20.5f, 12f)
                curveTo(20.5f, 11.134f, 20.371f, 10.299f, 20.13f, 9.512f)
                close()
                moveTo(3.5f, 12f)
                curveTo(3.5f, 12.865f, 3.629f, 13.7f, 3.869f, 14.486f)
                horizontalLineTo(8.866f)
                curveTo(8.784f, 14.383f, 8.708f, 14.276f, 8.636f, 14.165f)
                lineTo(8.501f, 13.943f)
                lineTo(4.887f, 7.345f)
                curveTo(4.01f, 8.683f, 3.5f, 10.282f, 3.5f, 12f)
                close()
                moveTo(10.02f, 10.474f)
                lineTo(9.976f, 10.545f)
                curveTo(9.954f, 10.58f, 9.929f, 10.611f, 9.903f, 10.641f)
                curveTo(9.648f, 11.032f, 9.5f, 11.499f, 9.5f, 12f)
                curveTo(9.5f, 13.294f, 10.483f, 14.359f, 11.744f, 14.487f)
                horizontalLineTo(12.256f)
                curveTo(13.517f, 14.359f, 14.5f, 13.294f, 14.5f, 12f)
                curveTo(14.5f, 10.698f, 13.505f, 9.629f, 12.235f, 9.511f)
                lineTo(11.862f, 9.513f)
                lineTo(11.804f, 9.508f)
                curveTo(11.078f, 9.564f, 10.44f, 9.93f, 10.02f, 10.474f)
                close()
                moveTo(12f, 3.5f)
                curveTo(9.609f, 3.5f, 7.448f, 4.488f, 5.903f, 6.077f)
                lineTo(8.305f, 10.464f)
                curveTo(8.432f, 10.16f, 8.596f, 9.874f, 8.79f, 9.613f)
                lineTo(12.694f, 3.528f)
                curveTo(12.465f, 3.509f, 12.234f, 3.5f, 12f, 3.5f)
                close()
                moveTo(11.594f, 8.02f)
                curveTo(11.728f, 8.007f, 11.863f, 8f, 12f, 8f)
                curveTo(12.103f, 8f, 12.204f, 8.004f, 12.305f, 8.011f)
                lineTo(19.509f, 8.013f)
                curveTo(18.476f, 6.072f, 16.712f, 4.579f, 14.585f, 3.9f)
                lineTo(14.293f, 3.813f)
                lineTo(11.594f, 8.02f)
                close()
            }
        }.build()

        return _Scan!!
    }

@Suppress("ObjectPropertyName")
private var _Scan: ImageVector? = null

@Preview
@Composable
private fun ScanPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Scan, contentDescription = null)
    }
}
