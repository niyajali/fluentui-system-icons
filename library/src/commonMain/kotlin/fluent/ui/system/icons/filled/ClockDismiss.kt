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

public val FluentUi.Filled.ClockDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClockDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.25f, 12.5f)
            horizontalLineTo(12.25f)
            curveTo(11.836f, 12.5f, 11.5f, 12.164f, 11.5f, 11.75f)
            verticalLineTo(5.75f)
            curveTo(11.5f, 5.336f, 11.836f, 5f, 12.25f, 5f)
            curveTo(12.664f, 5f, 13f, 5.336f, 13f, 5.75f)
            verticalLineTo(11f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 11f, 17f, 11.336f, 17f, 11.75f)
            curveTo(17f, 12.164f, 16.664f, 12.5f, 16.25f, 12.5f)
            close()
            moveTo(13f, 1f)
            curveTo(7.478f, 1f, 3f, 5.478f, 3f, 11f)
            curveTo(3f, 11.334f, 3.016f, 11.665f, 3.049f, 11.991f)
            curveTo(4.049f, 11.363f, 5.232f, 11f, 6.5f, 11f)
            curveTo(10.09f, 11f, 13f, 13.91f, 13f, 17.5f)
            curveTo(13f, 18.768f, 12.637f, 19.951f, 12.009f, 20.951f)
            curveTo(12.335f, 20.984f, 12.666f, 21f, 13f, 21f)
            curveTo(18.522f, 21f, 23f, 16.522f, 23f, 11f)
            curveTo(23f, 5.478f, 18.522f, 1f, 13f, 1f)
            close()
            moveTo(12f, 17.5f)
            curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
            curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
            curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
            curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
            close()
            moveTo(4.854f, 15.146f)
            curveTo(4.658f, 14.951f, 4.342f, 14.951f, 4.146f, 15.146f)
            curveTo(3.951f, 15.342f, 3.951f, 15.658f, 4.146f, 15.854f)
            lineTo(5.793f, 17.5f)
            lineTo(4.146f, 19.146f)
            curveTo(3.951f, 19.342f, 3.951f, 19.658f, 4.146f, 19.854f)
            curveTo(4.342f, 20.049f, 4.658f, 20.049f, 4.854f, 19.854f)
            lineTo(6.5f, 18.207f)
            lineTo(8.146f, 19.854f)
            curveTo(8.342f, 20.049f, 8.658f, 20.049f, 8.854f, 19.854f)
            curveTo(9.049f, 19.658f, 9.049f, 19.342f, 8.854f, 19.146f)
            lineTo(7.207f, 17.5f)
            lineTo(8.854f, 15.854f)
            curveTo(9.049f, 15.658f, 9.049f, 15.342f, 8.854f, 15.146f)
            curveTo(8.658f, 14.951f, 8.342f, 14.951f, 8.146f, 15.146f)
            lineTo(6.5f, 16.793f)
            lineTo(4.854f, 15.146f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ClockDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ClockDismiss, contentDescription = null)
    }
}
