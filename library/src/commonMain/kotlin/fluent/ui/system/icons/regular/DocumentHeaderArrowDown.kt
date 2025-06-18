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

public val FluentUi.Regular.DocumentHeaderArrowDown: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentHeaderArrowDown",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8.505f, 5.004f)
            curveTo(7.677f, 5.004f, 7.005f, 5.676f, 7.005f, 6.505f)
            curveTo(7.005f, 7.333f, 7.677f, 8.005f, 8.505f, 8.005f)
            horizontalLineTo(15.505f)
            curveTo(16.334f, 8.005f, 17.005f, 7.333f, 17.005f, 6.505f)
            curveTo(17.005f, 5.676f, 16.334f, 5.004f, 15.505f, 5.004f)
            horizontalLineTo(8.505f)
            close()
            moveTo(19.995f, 4.096f)
            curveTo(19.916f, 2.925f, 18.941f, 2f, 17.75f, 2f)
            horizontalLineTo(6.25f)
            lineTo(6.096f, 2.005f)
            curveTo(4.925f, 2.084f, 4f, 3.059f, 4f, 4.25f)
            verticalLineTo(19.75f)
            lineTo(4.005f, 19.904f)
            curveTo(4.084f, 21.075f, 5.059f, 22f, 6.25f, 22f)
            horizontalLineTo(12.81f)
            curveTo(12.383f, 21.556f, 12.019f, 21.051f, 11.732f, 20.5f)
            horizontalLineTo(6.25f)
            lineTo(6.148f, 20.493f)
            curveTo(5.782f, 20.443f, 5.5f, 20.129f, 5.5f, 19.75f)
            verticalLineTo(4.25f)
            lineTo(5.507f, 4.148f)
            curveTo(5.557f, 3.782f, 5.87f, 3.5f, 6.25f, 3.5f)
            horizontalLineTo(17.75f)
            lineTo(17.852f, 3.507f)
            curveTo(18.218f, 3.557f, 18.5f, 3.87f, 18.5f, 4.25f)
            verticalLineTo(11.076f)
            curveTo(19.023f, 11.157f, 19.526f, 11.3f, 20f, 11.498f)
            verticalLineTo(4.25f)
            lineTo(19.995f, 4.096f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(18f, 14.5f)
            curveTo(18f, 14.224f, 17.776f, 14f, 17.5f, 14f)
            curveTo(17.224f, 14f, 17f, 14.224f, 17f, 14.5f)
            verticalLineTo(19.293f)
            lineTo(15.354f, 17.646f)
            curveTo(15.158f, 17.451f, 14.842f, 17.451f, 14.646f, 17.646f)
            curveTo(14.451f, 17.842f, 14.451f, 18.158f, 14.646f, 18.354f)
            lineTo(17.146f, 20.854f)
            curveTo(17.342f, 21.049f, 17.658f, 21.049f, 17.854f, 20.854f)
            lineTo(20.354f, 18.354f)
            curveTo(20.549f, 18.158f, 20.549f, 17.842f, 20.354f, 17.646f)
            curveTo(20.158f, 17.451f, 19.842f, 17.451f, 19.646f, 17.646f)
            lineTo(18f, 19.293f)
            verticalLineTo(14.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentHeaderArrowDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentHeaderArrowDown, contentDescription = null)
    }
}
