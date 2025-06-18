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

public val FluentUi.Filled.CloudArrowDown: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CloudArrowDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.08f, 8.019f)
            curveTo(6.548f, 5.172f, 9.02f, 3f, 12f, 3f)
            curveTo(14.98f, 3f, 17.452f, 5.172f, 17.92f, 8.019f)
            curveTo(20.208f, 8.231f, 22f, 10.156f, 22f, 12.5f)
            curveTo(22f, 12.666f, 21.991f, 12.831f, 21.973f, 12.993f)
            curveTo(20.817f, 11.193f, 18.798f, 10f, 16.5f, 10f)
            curveTo(12.91f, 10f, 10f, 12.91f, 10f, 16.5f)
            curveTo(10f, 16.668f, 10.006f, 16.835f, 10.019f, 17f)
            horizontalLineTo(6.5f)
            curveTo(4.015f, 17f, 2f, 14.985f, 2f, 12.5f)
            curveTo(2f, 10.156f, 3.792f, 8.231f, 6.08f, 8.019f)
            close()
            moveTo(22f, 16.5f)
            curveTo(22f, 19.538f, 19.538f, 22f, 16.5f, 22f)
            curveTo(13.462f, 22f, 11f, 19.538f, 11f, 16.5f)
            curveTo(11f, 13.462f, 13.462f, 11f, 16.5f, 11f)
            curveTo(19.538f, 11f, 22f, 13.462f, 22f, 16.5f)
            close()
            moveTo(17f, 13.5f)
            curveTo(17f, 13.224f, 16.776f, 13f, 16.5f, 13f)
            curveTo(16.224f, 13f, 16f, 13.224f, 16f, 13.5f)
            verticalLineTo(18.293f)
            lineTo(14.354f, 16.646f)
            curveTo(14.158f, 16.451f, 13.842f, 16.451f, 13.646f, 16.646f)
            curveTo(13.451f, 16.842f, 13.451f, 17.158f, 13.646f, 17.354f)
            lineTo(16.146f, 19.854f)
            curveTo(16.342f, 20.049f, 16.658f, 20.049f, 16.854f, 19.854f)
            lineTo(19.354f, 17.354f)
            curveTo(19.549f, 17.158f, 19.549f, 16.842f, 19.354f, 16.646f)
            curveTo(19.158f, 16.451f, 18.842f, 16.451f, 18.646f, 16.646f)
            lineTo(17f, 18.293f)
            verticalLineTo(13.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CloudArrowDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CloudArrowDown, contentDescription = null)
    }
}
