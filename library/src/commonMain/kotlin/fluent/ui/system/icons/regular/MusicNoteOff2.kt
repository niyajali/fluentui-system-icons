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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.MusicNoteOff2: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MusicNoteOff2",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.5f, 9.561f)
            verticalLineTo(15.627f)
            curveTo(7.933f, 15.232f, 7.244f, 15f, 6.5f, 15f)
            curveTo(4.567f, 15f, 3f, 16.567f, 3f, 18.5f)
            curveTo(3f, 20.433f, 4.567f, 22f, 6.5f, 22f)
            curveTo(8.433f, 22f, 10f, 20.433f, 10f, 18.5f)
            curveTo(10f, 18.443f, 9.999f, 18.386f, 9.996f, 18.329f)
            curveTo(9.999f, 18.303f, 10f, 18.277f, 10f, 18.25f)
            verticalLineTo(11.061f)
            lineTo(13.552f, 14.613f)
            curveTo(13.203f, 15.157f, 13f, 15.805f, 13f, 16.5f)
            curveTo(13f, 18.433f, 14.567f, 20f, 16.5f, 20f)
            curveTo(17.195f, 20f, 17.843f, 19.797f, 18.387f, 19.448f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(8.5f, 9.561f)
            close()
            moveTo(17.281f, 18.342f)
            curveTo(17.041f, 18.444f, 16.777f, 18.5f, 16.5f, 18.5f)
            curveTo(15.395f, 18.5f, 14.5f, 17.605f, 14.5f, 16.5f)
            curveTo(14.5f, 16.223f, 14.556f, 15.959f, 14.658f, 15.719f)
            lineTo(17.281f, 18.342f)
            close()
            moveTo(6.5f, 16.5f)
            curveTo(7.605f, 16.5f, 8.5f, 17.395f, 8.5f, 18.5f)
            curveTo(8.5f, 19.605f, 7.605f, 20.5f, 6.5f, 20.5f)
            curveTo(5.395f, 20.5f, 4.5f, 19.605f, 4.5f, 18.5f)
            curveTo(4.5f, 17.395f, 5.395f, 16.5f, 6.5f, 16.5f)
            close()
            moveTo(16.5f, 13f)
            curveTo(16.397f, 13f, 16.295f, 13.004f, 16.195f, 13.013f)
            lineTo(19.987f, 16.805f)
            curveTo(19.996f, 16.705f, 20f, 16.603f, 20f, 16.5f)
            curveTo(20f, 16.443f, 19.999f, 16.386f, 19.996f, 16.329f)
            curveTo(19.999f, 16.303f, 20f, 16.277f, 20f, 16.25f)
            verticalLineTo(2.75f)
            curveTo(20f, 2.513f, 19.888f, 2.29f, 19.698f, 2.148f)
            curveTo(19.507f, 2.007f, 19.262f, 1.964f, 19.035f, 2.032f)
            lineTo(9.034f, 5.032f)
            curveTo(8.836f, 5.091f, 8.676f, 5.228f, 8.585f, 5.403f)
            lineTo(10f, 6.818f)
            verticalLineTo(6.308f)
            lineTo(18.5f, 3.758f)
            verticalLineTo(6.192f)
            lineTo(11.48f, 8.298f)
            lineTo(12.684f, 9.503f)
            lineTo(18.5f, 7.758f)
            verticalLineTo(13.627f)
            curveTo(17.933f, 13.232f, 17.244f, 13f, 16.5f, 13f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MusicNoteOff2Preview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.MusicNoteOff2, contentDescription = null)
    }
}
