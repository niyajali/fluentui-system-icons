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

public val FluentUi.Filled.DocumentPageBottomCenter: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentPageBottomCenter",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.256f, 16.882f)
            lineTo(11.494f, 15.382f)
            horizontalLineTo(12.975f)
            lineTo(12.738f, 16.882f)
            horizontalLineTo(11.256f)
            close()
            moveTo(17.75f, 2f)
            curveTo(18.941f, 2f, 19.916f, 2.925f, 19.995f, 4.096f)
            lineTo(20f, 4.25f)
            verticalLineTo(19.748f)
            curveTo(20f, 20.939f, 19.075f, 21.914f, 17.904f, 21.993f)
            lineTo(17.75f, 21.998f)
            horizontalLineTo(6.25f)
            curveTo(5.059f, 21.998f, 4.084f, 21.073f, 4.005f, 19.902f)
            lineTo(4f, 19.748f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.059f, 4.925f, 2.084f, 6.096f, 2.005f)
            lineTo(6.25f, 2f)
            horizontalLineTo(17.75f)
            close()
            moveTo(12.395f, 19.042f)
            curveTo(12.331f, 19.452f, 12.61f, 19.836f, 13.019f, 19.901f)
            curveTo(13.428f, 19.965f, 13.812f, 19.686f, 13.877f, 19.277f)
            lineTo(14.019f, 18.382f)
            horizontalLineTo(14.75f)
            curveTo(15.164f, 18.382f, 15.5f, 18.046f, 15.5f, 17.632f)
            curveTo(15.5f, 17.218f, 15.164f, 16.882f, 14.75f, 16.882f)
            horizontalLineTo(14.256f)
            lineTo(14.494f, 15.382f)
            horizontalLineTo(15.25f)
            curveTo(15.664f, 15.382f, 16f, 15.046f, 16f, 14.632f)
            curveTo(16f, 14.217f, 15.664f, 13.882f, 15.25f, 13.882f)
            horizontalLineTo(14.731f)
            lineTo(14.893f, 12.857f)
            curveTo(14.958f, 12.448f, 14.679f, 12.064f, 14.27f, 11.999f)
            curveTo(13.861f, 11.934f, 13.477f, 12.213f, 13.412f, 12.623f)
            lineTo(13.212f, 13.882f)
            horizontalLineTo(11.731f)
            lineTo(11.893f, 12.857f)
            curveTo(11.958f, 12.448f, 11.679f, 12.064f, 11.27f, 11.999f)
            curveTo(10.861f, 11.934f, 10.477f, 12.213f, 10.412f, 12.623f)
            lineTo(10.212f, 13.882f)
            horizontalLineTo(9.25f)
            curveTo(8.836f, 13.882f, 8.5f, 14.217f, 8.5f, 14.632f)
            curveTo(8.5f, 15.046f, 8.836f, 15.382f, 9.25f, 15.382f)
            horizontalLineTo(9.975f)
            lineTo(9.738f, 16.882f)
            horizontalLineTo(8.75f)
            curveTo(8.336f, 16.882f, 8f, 17.218f, 8f, 17.632f)
            curveTo(8f, 18.046f, 8.336f, 18.382f, 8.75f, 18.382f)
            horizontalLineTo(9.5f)
            lineTo(9.395f, 19.042f)
            curveTo(9.331f, 19.452f, 9.61f, 19.836f, 10.019f, 19.901f)
            curveTo(10.428f, 19.965f, 10.812f, 19.686f, 10.877f, 19.277f)
            lineTo(11.019f, 18.382f)
            horizontalLineTo(12.5f)
            lineTo(12.395f, 19.042f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentPageBottomCenterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.DocumentPageBottomCenter, contentDescription = null)
    }
}
