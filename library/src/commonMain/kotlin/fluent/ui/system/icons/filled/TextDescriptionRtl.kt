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

public val FluentUi.Filled.TextDescriptionRtl: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextDescriptionRtl",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 17f)
            horizontalLineTo(9f)
            curveTo(8.448f, 17f, 8f, 17.448f, 8f, 18f)
            curveTo(8f, 18.513f, 8.386f, 18.935f, 8.883f, 18.993f)
            lineTo(9f, 19f)
            horizontalLineTo(21f)
            curveTo(21.552f, 19f, 22f, 18.552f, 22f, 18f)
            curveTo(22f, 17.487f, 21.614f, 17.065f, 21.117f, 17.007f)
            lineTo(21f, 17f)
            horizontalLineTo(9f)
            horizontalLineTo(21f)
            close()
            moveTo(21f, 13f)
            horizontalLineTo(3f)
            curveTo(2.448f, 13f, 2f, 13.448f, 2f, 14f)
            curveTo(2f, 14.513f, 2.386f, 14.936f, 2.883f, 14.993f)
            lineTo(3f, 15f)
            horizontalLineTo(21f)
            curveTo(21.552f, 15f, 22f, 14.552f, 22f, 14f)
            curveTo(22f, 13.487f, 21.614f, 13.064f, 21.117f, 13.007f)
            lineTo(21f, 13f)
            horizontalLineTo(3f)
            horizontalLineTo(21f)
            close()
            moveTo(21f, 9f)
            horizontalLineTo(3f)
            curveTo(2.448f, 9f, 2f, 9.448f, 2f, 10f)
            curveTo(2f, 10.513f, 2.386f, 10.936f, 2.883f, 10.993f)
            lineTo(3f, 11f)
            horizontalLineTo(21f)
            curveTo(21.552f, 11f, 22f, 10.552f, 22f, 10f)
            curveTo(22f, 9.487f, 21.614f, 9.064f, 21.117f, 9.007f)
            lineTo(21f, 9f)
            horizontalLineTo(3f)
            horizontalLineTo(21f)
            close()
            moveTo(21f, 5f)
            horizontalLineTo(3f)
            curveTo(2.448f, 5f, 2f, 5.448f, 2f, 6f)
            curveTo(2f, 6.513f, 2.386f, 6.936f, 2.883f, 6.993f)
            lineTo(3f, 7f)
            horizontalLineTo(21f)
            curveTo(21.552f, 7f, 22f, 6.552f, 22f, 6f)
            curveTo(22f, 5.487f, 21.614f, 5.064f, 21.117f, 5.007f)
            lineTo(21f, 5f)
            horizontalLineTo(3f)
            horizontalLineTo(21f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextDescriptionRtlPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextDescriptionRtl, contentDescription = null)
    }
}
