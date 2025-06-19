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

public val FluentIcons.Regular.Component2DoubleTapSwipeUp: ImageVector
    get() {
        if (_Component2DoubleTapSwipeUp != null) {
            return _Component2DoubleTapSwipeUp!!
        }
        _Component2DoubleTapSwipeUp = ImageVector.Builder(
            name = "Regular.Component2DoubleTapSwipeUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 16.017f)
                curveTo(12.38f, 16.017f, 12.693f, 15.735f, 12.743f, 15.369f)
                lineTo(12.75f, 15.267f)
                verticalLineTo(4.562f)
                lineTo(14.97f, 6.78f)
                curveTo(15.236f, 7.047f, 15.653f, 7.071f, 15.946f, 6.853f)
                lineTo(16.03f, 6.78f)
                curveTo(16.297f, 6.514f, 16.321f, 6.097f, 16.103f, 5.804f)
                lineTo(16.03f, 5.72f)
                lineTo(12.53f, 2.22f)
                curveTo(12.264f, 1.953f, 11.847f, 1.929f, 11.554f, 2.147f)
                lineTo(11.47f, 2.22f)
                lineTo(7.97f, 5.72f)
                curveTo(7.677f, 6.013f, 7.677f, 6.487f, 7.97f, 6.78f)
                curveTo(8.236f, 7.047f, 8.653f, 7.071f, 8.946f, 6.853f)
                lineTo(9.03f, 6.78f)
                lineTo(11.25f, 4.562f)
                verticalLineTo(15.267f)
                curveTo(11.25f, 15.681f, 11.586f, 16.017f, 12f, 16.017f)
                close()
                moveTo(12f, 22.017f)
                curveTo(15.866f, 22.017f, 19f, 18.883f, 19f, 15.017f)
                curveTo(19f, 11.755f, 16.77f, 9.015f, 13.751f, 8.238f)
                lineTo(13.751f, 9.801f)
                curveTo(15.93f, 10.533f, 17.5f, 12.591f, 17.5f, 15.017f)
                curveTo(17.5f, 18.054f, 15.038f, 20.517f, 12f, 20.517f)
                curveTo(8.962f, 20.517f, 6.5f, 18.054f, 6.5f, 15.017f)
                curveTo(6.5f, 12.591f, 8.071f, 10.532f, 10.25f, 9.801f)
                lineTo(10.25f, 8.237f)
                curveTo(7.231f, 9.014f, 5f, 11.755f, 5f, 15.017f)
                curveTo(5f, 18.883f, 8.134f, 22.017f, 12f, 22.017f)
                close()
                moveTo(12f, 19.517f)
                curveTo(14.485f, 19.517f, 16.5f, 17.502f, 16.5f, 15.017f)
                curveTo(16.5f, 13.153f, 15.366f, 11.553f, 13.751f, 10.87f)
                lineTo(13.75f, 12.58f)
                curveTo(14.507f, 13.125f, 15f, 14.013f, 15f, 15.017f)
                curveTo(15f, 16.674f, 13.657f, 18.017f, 12f, 18.017f)
                curveTo(10.343f, 18.017f, 9f, 16.674f, 9f, 15.017f)
                curveTo(9f, 14.013f, 9.493f, 13.124f, 10.251f, 12.579f)
                lineTo(10.25f, 10.87f)
                curveTo(8.634f, 11.553f, 7.5f, 13.152f, 7.5f, 15.017f)
                curveTo(7.5f, 17.502f, 9.515f, 19.517f, 12f, 19.517f)
                close()
            }
        }.build()

        return _Component2DoubleTapSwipeUp!!
    }

@Suppress("ObjectPropertyName")
private var _Component2DoubleTapSwipeUp: ImageVector? = null

@Preview
@Composable
private fun Component2DoubleTapSwipeUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Component2DoubleTapSwipeUp, contentDescription = null)
    }
}
