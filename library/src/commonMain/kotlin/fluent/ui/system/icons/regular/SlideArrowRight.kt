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

public val FluentUi.Regular.SlideArrowRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlideArrowRight",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.75f, 8f)
            curveTo(6.336f, 8f, 6f, 8.336f, 6f, 8.75f)
            curveTo(6f, 9.164f, 6.336f, 9.5f, 6.75f, 9.5f)
            horizontalLineTo(11.25f)
            curveTo(11.664f, 9.5f, 12f, 9.164f, 12f, 8.75f)
            curveTo(12f, 8.336f, 11.664f, 8f, 11.25f, 8f)
            horizontalLineTo(6.75f)
            close()
            moveTo(6f, 11.75f)
            curveTo(6f, 11.336f, 6.336f, 11f, 6.75f, 11f)
            horizontalLineTo(15.25f)
            curveTo(15.461f, 11f, 15.652f, 11.087f, 15.788f, 11.228f)
            curveTo(14.88f, 11.475f, 14.05f, 11.915f, 13.346f, 12.5f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 12.5f, 6f, 12.164f, 6f, 11.75f)
            close()
            moveTo(20.5f, 6.75f)
            verticalLineTo(11.732f)
            curveTo(21.051f, 12.019f, 21.556f, 12.383f, 22f, 12.81f)
            verticalLineTo(6.75f)
            curveTo(22f, 5.231f, 20.769f, 4f, 19.25f, 4f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
            verticalLineTo(17.25f)
            curveTo(2f, 18.769f, 3.231f, 20f, 4.75f, 20f)
            horizontalLineTo(11.498f)
            curveTo(11.3f, 19.526f, 11.157f, 19.023f, 11.076f, 18.5f)
            horizontalLineTo(4.75f)
            curveTo(4.06f, 18.5f, 3.5f, 17.94f, 3.5f, 17.25f)
            verticalLineTo(6.75f)
            curveTo(3.5f, 6.06f, 4.06f, 5.5f, 4.75f, 5.5f)
            horizontalLineTo(19.25f)
            curveTo(19.94f, 5.5f, 20.5f, 6.06f, 20.5f, 6.75f)
            close()
            moveTo(11.314f, 15.5f)
            curveTo(11.486f, 14.967f, 11.725f, 14.463f, 12.022f, 14f)
            horizontalLineTo(6.75f)
            curveTo(6.336f, 14f, 6f, 14.336f, 6f, 14.75f)
            curveTo(6f, 15.164f, 6.336f, 15.5f, 6.75f, 15.5f)
            horizontalLineTo(11.314f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(14.5f, 17f)
            curveTo(14.224f, 17f, 14f, 17.224f, 14f, 17.5f)
            curveTo(14f, 17.776f, 14.224f, 18f, 14.5f, 18f)
            horizontalLineTo(19.293f)
            lineTo(17.646f, 19.646f)
            curveTo(17.451f, 19.842f, 17.451f, 20.158f, 17.646f, 20.354f)
            curveTo(17.842f, 20.549f, 18.158f, 20.549f, 18.354f, 20.354f)
            lineTo(20.854f, 17.854f)
            curveTo(21.049f, 17.658f, 21.049f, 17.342f, 20.854f, 17.146f)
            lineTo(18.354f, 14.646f)
            curveTo(18.158f, 14.451f, 17.842f, 14.451f, 17.646f, 14.646f)
            curveTo(17.451f, 14.842f, 17.451f, 15.158f, 17.646f, 15.354f)
            lineTo(19.293f, 17f)
            horizontalLineTo(14.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SlideArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.SlideArrowRight, contentDescription = null)
    }
}
