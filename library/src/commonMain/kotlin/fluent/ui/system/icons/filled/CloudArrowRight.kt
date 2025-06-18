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

public val FluentUi.Filled.CloudArrowRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudArrowRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 3f)
            curveTo(9.02f, 3f, 6.548f, 5.172f, 6.08f, 8.019f)
            curveTo(3.792f, 8.231f, 2f, 10.156f, 2f, 12.5f)
            curveTo(2f, 14.985f, 4.015f, 17f, 6.5f, 17f)
            horizontalLineTo(10.019f)
            curveTo(10.006f, 16.835f, 10f, 16.668f, 10f, 16.5f)
            curveTo(10f, 12.91f, 12.91f, 10f, 16.5f, 10f)
            curveTo(18.798f, 10f, 20.817f, 11.193f, 21.973f, 12.993f)
            curveTo(21.991f, 12.831f, 22f, 12.666f, 22f, 12.5f)
            curveTo(22f, 10.156f, 20.208f, 8.231f, 17.92f, 8.019f)
            curveTo(17.452f, 5.172f, 14.98f, 3f, 12f, 3f)
            close()
            moveTo(16.5f, 11f)
            curveTo(19.538f, 11f, 22f, 13.462f, 22f, 16.5f)
            curveTo(22f, 19.538f, 19.538f, 22f, 16.5f, 22f)
            curveTo(13.462f, 22f, 11f, 19.538f, 11f, 16.5f)
            curveTo(11f, 13.462f, 13.462f, 11f, 16.5f, 11f)
            close()
            moveTo(13.5f, 16f)
            curveTo(13.224f, 16f, 13f, 16.224f, 13f, 16.5f)
            curveTo(13f, 16.776f, 13.224f, 17f, 13.5f, 17f)
            horizontalLineTo(18.293f)
            lineTo(16.646f, 18.646f)
            curveTo(16.451f, 18.842f, 16.451f, 19.158f, 16.646f, 19.354f)
            curveTo(16.842f, 19.549f, 17.158f, 19.549f, 17.354f, 19.354f)
            lineTo(19.854f, 16.854f)
            curveTo(20.049f, 16.658f, 20.049f, 16.342f, 19.854f, 16.146f)
            lineTo(17.354f, 13.646f)
            curveTo(17.158f, 13.451f, 16.842f, 13.451f, 16.646f, 13.646f)
            curveTo(16.451f, 13.842f, 16.451f, 14.158f, 16.646f, 14.354f)
            lineTo(18.293f, 16f)
            horizontalLineTo(13.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CloudArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CloudArrowRight, contentDescription = null)
    }
}
