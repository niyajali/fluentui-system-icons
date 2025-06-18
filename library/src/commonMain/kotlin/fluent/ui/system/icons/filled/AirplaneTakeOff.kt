package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.AirplaneTakeOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AirplaneTakeOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.523f, 4.41f)
            lineTo(12.394f, 5.925f)
            curveTo(12.203f, 6.13f, 12.035f, 6.323f, 11.895f, 6.492f)
            curveTo(11.771f, 6.641f, 11.657f, 6.69f, 11.601f, 6.702f)
            lineTo(8.138f, 7.424f)
            lineTo(7.756f, 6.742f)
            curveTo(7.068f, 5.514f, 7.956f, 4f, 9.363f, 4f)
            curveTo(9.785f, 4f, 10.194f, 4.145f, 10.523f, 4.41f)
            close()
            moveTo(16.692f, 4.503f)
            curveTo(18.93f, 4.33f, 20.602f, 5.746f, 21.547f, 6.829f)
            curveTo(22.036f, 7.389f, 22.134f, 8.097f, 21.925f, 8.712f)
            curveTo(21.72f, 9.314f, 21.231f, 9.809f, 20.583f, 10.032f)
            lineTo(15.212f, 11.884f)
            lineTo(11.976f, 16.199f)
            curveTo(11.598f, 16.703f, 11.004f, 17f, 10.373f, 17f)
            curveTo(8.946f, 17f, 7.976f, 15.552f, 8.52f, 14.233f)
            lineTo(9.028f, 12.999f)
            lineTo(5.727f, 13.634f)
            curveTo(4.312f, 13.906f, 3f, 12.822f, 3f, 11.382f)
            verticalLineTo(7.692f)
            curveTo(3f, 6.758f, 3.757f, 6f, 4.691f, 6f)
            curveTo(5.31f, 6f, 5.88f, 6.338f, 6.176f, 6.882f)
            lineTo(7.142f, 8.653f)
            lineTo(11.805f, 7.681f)
            curveTo(12.119f, 7.616f, 12.422f, 7.423f, 12.665f, 7.131f)
            curveTo(13.035f, 6.684f, 13.594f, 6.076f, 14.263f, 5.56f)
            curveTo(14.922f, 5.052f, 15.763f, 4.574f, 16.692f, 4.503f)
            close()
            moveTo(3.75f, 19.5f)
            curveTo(3.336f, 19.5f, 3f, 19.836f, 3f, 20.25f)
            curveTo(3f, 20.664f, 3.336f, 21f, 3.75f, 21f)
            horizontalLineTo(20.25f)
            curveTo(20.664f, 21f, 21f, 20.664f, 21f, 20.25f)
            curveTo(21f, 19.836f, 20.664f, 19.5f, 20.25f, 19.5f)
            horizontalLineTo(3.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun AirplaneTakeOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.AirplaneTakeOff, contentDescription = null)
    }
}
