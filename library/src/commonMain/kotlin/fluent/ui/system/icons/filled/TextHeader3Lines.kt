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

public val FluentUi.Filled.TextHeader3Lines: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextHeader3Lines",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.573f, 3.812f)
            curveTo(14.054f, 3.645f, 13.207f, 3.826f, 12.742f, 4.345f)
            curveTo(12.373f, 4.756f, 11.742f, 4.79f, 11.332f, 4.421f)
            curveTo(10.921f, 4.052f, 10.887f, 3.419f, 11.256f, 3.009f)
            curveTo(12.257f, 1.892f, 13.928f, 1.505f, 15.182f, 1.907f)
            curveTo(16.856f, 2.443f, 17.917f, 4.423f, 16.771f, 6.129f)
            curveTo(16.678f, 6.267f, 16.58f, 6.391f, 16.476f, 6.502f)
            curveTo(16.58f, 6.614f, 16.678f, 6.737f, 16.771f, 6.875f)
            curveTo(17.917f, 8.581f, 16.856f, 10.561f, 15.182f, 11.097f)
            curveTo(13.928f, 11.499f, 12.257f, 11.112f, 11.256f, 9.996f)
            curveTo(10.887f, 9.585f, 10.921f, 8.952f, 11.332f, 8.583f)
            curveTo(11.742f, 8.214f, 12.373f, 8.248f, 12.742f, 8.659f)
            curveTo(13.207f, 9.178f, 14.054f, 9.359f, 14.573f, 9.193f)
            curveTo(14.889f, 9.092f, 15.099f, 8.877f, 15.19f, 8.657f)
            curveTo(15.274f, 8.453f, 15.27f, 8.224f, 15.113f, 7.991f)
            curveTo(14.833f, 7.574f, 14.373f, 7.509f, 13.646f, 7.503f)
            lineTo(13.599f, 7.502f)
            lineTo(13.513f, 7.502f)
            curveTo(12.961f, 7.502f, 12.514f, 7.054f, 12.514f, 6.502f)
            curveTo(12.514f, 5.95f, 12.961f, 5.502f, 13.513f, 5.502f)
            lineTo(13.599f, 5.502f)
            lineTo(13.646f, 5.502f)
            curveTo(14.373f, 5.496f, 14.833f, 5.43f, 15.113f, 5.013f)
            curveTo(15.27f, 4.78f, 15.274f, 4.551f, 15.19f, 4.347f)
            curveTo(15.099f, 4.127f, 14.889f, 3.913f, 14.573f, 3.812f)
            close()
            moveTo(4f, 3f)
            curveTo(4f, 2.448f, 3.552f, 2f, 3f, 2f)
            curveTo(2.448f, 2f, 2f, 2.448f, 2f, 3f)
            verticalLineTo(10f)
            curveTo(2f, 10.552f, 2.448f, 11f, 3f, 11f)
            curveTo(3.552f, 11f, 4f, 10.552f, 4f, 10f)
            lineTo(4f, 7.5f)
            lineTo(7f, 7.5f)
            verticalLineTo(9.995f)
            curveTo(7f, 10.547f, 7.448f, 10.995f, 8f, 10.995f)
            curveTo(8.552f, 10.995f, 9f, 10.547f, 9f, 9.995f)
            lineTo(9f, 3.002f)
            curveTo(9f, 2.449f, 8.552f, 2.002f, 8f, 2.002f)
            curveTo(7.448f, 2.002f, 7f, 2.449f, 7f, 3.002f)
            verticalLineTo(5.5f)
            horizontalLineTo(4f)
            lineTo(4f, 3f)
            close()
            moveTo(3f, 19f)
            curveTo(2.448f, 19f, 2f, 19.448f, 2f, 20f)
            curveTo(2f, 20.552f, 2.448f, 21f, 3f, 21f)
            horizontalLineTo(21f)
            curveTo(21.552f, 21f, 22f, 20.552f, 22f, 20f)
            curveTo(22f, 19.448f, 21.552f, 19f, 21f, 19f)
            horizontalLineTo(3f)
            close()
            moveTo(2f, 15f)
            curveTo(2f, 14.448f, 2.448f, 14f, 3f, 14f)
            horizontalLineTo(21f)
            curveTo(21.552f, 14f, 22f, 14.448f, 22f, 15f)
            curveTo(22f, 15.552f, 21.552f, 16f, 21f, 16f)
            horizontalLineTo(3f)
            curveTo(2.448f, 16f, 2f, 15.552f, 2f, 15f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextHeader3LinesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextHeader3Lines, contentDescription = null)
    }
}
