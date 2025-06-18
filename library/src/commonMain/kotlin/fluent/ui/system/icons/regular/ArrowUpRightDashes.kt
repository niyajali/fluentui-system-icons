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

public val FluentUi.Regular.ArrowUpRightDashes: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUpRightDashes",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.751f, 3f)
            curveTo(10.337f, 3f, 10.001f, 3.336f, 10.001f, 3.75f)
            curveTo(10.001f, 4.164f, 10.337f, 4.5f, 10.751f, 4.5f)
            horizontalLineTo(18.42f)
            lineTo(16.92f, 6f)
            horizontalLineTo(16.939f)
            lineTo(15.22f, 7.72f)
            curveTo(14.927f, 8.013f, 14.927f, 8.487f, 15.22f, 8.78f)
            curveTo(15.513f, 9.073f, 15.987f, 9.073f, 16.28f, 8.78f)
            lineTo(18f, 7.061f)
            verticalLineTo(7.082f)
            lineTo(19.501f, 5.582f)
            verticalLineTo(13.25f)
            curveTo(19.501f, 13.664f, 19.837f, 14f, 20.251f, 14f)
            curveTo(20.665f, 14f, 21.001f, 13.664f, 21.001f, 13.25f)
            verticalLineTo(3.75f)
            curveTo(21.001f, 3.336f, 20.665f, 3f, 20.251f, 3f)
            horizontalLineTo(10.751f)
            close()
            moveTo(3f, 20.318f)
            curveTo(2.995f, 20.266f, 2.995f, 20.214f, 3f, 20.163f)
            verticalLineTo(20.25f)
            verticalLineTo(20.318f)
            close()
            moveTo(3.75f, 21f)
            curveTo(3.558f, 21f, 3.366f, 20.927f, 3.22f, 20.78f)
            curveTo(3.073f, 20.634f, 3f, 20.442f, 3f, 20.25f)
            curveTo(3f, 20.058f, 3.073f, 19.866f, 3.22f, 19.72f)
            lineTo(6.47f, 16.47f)
            curveTo(6.763f, 16.177f, 7.237f, 16.177f, 7.53f, 16.47f)
            curveTo(7.823f, 16.763f, 7.823f, 17.237f, 7.53f, 17.53f)
            lineTo(4.28f, 20.78f)
            curveTo(4.134f, 20.927f, 3.942f, 21f, 3.75f, 21f)
            close()
            moveTo(3.75f, 21f)
            horizontalLineTo(3.674f)
            curveTo(3.731f, 21.007f, 3.79f, 21.007f, 3.848f, 21f)
            horizontalLineTo(3.75f)
            close()
            moveTo(13.53f, 11.53f)
            curveTo(13.823f, 11.237f, 13.823f, 10.763f, 13.53f, 10.47f)
            curveTo(13.237f, 10.177f, 12.763f, 10.177f, 12.47f, 10.47f)
            lineTo(9.22f, 13.72f)
            curveTo(8.927f, 14.013f, 8.927f, 14.487f, 9.22f, 14.78f)
            curveTo(9.513f, 15.073f, 9.987f, 15.073f, 10.28f, 14.78f)
            lineTo(13.53f, 11.53f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowUpRightDashesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowUpRightDashes, contentDescription = null)
    }
}
