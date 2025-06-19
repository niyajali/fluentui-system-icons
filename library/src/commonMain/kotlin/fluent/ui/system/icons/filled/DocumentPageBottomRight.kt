package fluent.ui.system.icons.filled

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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.DocumentPageBottomRight: ImageVector
    get() {
        if (_DocumentPageBottomRight != null) {
            return _DocumentPageBottomRight!!
        }
        _DocumentPageBottomRight = ImageVector.Builder(
            name = "Filled.DocumentPageBottomRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.256f, 16.882f)
                lineTo(13.494f, 15.382f)
                horizontalLineTo(14.975f)
                lineTo(14.738f, 16.882f)
                horizontalLineTo(13.256f)
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
                moveTo(14.395f, 19.042f)
                curveTo(14.331f, 19.452f, 14.61f, 19.836f, 15.019f, 19.901f)
                curveTo(15.428f, 19.965f, 15.812f, 19.686f, 15.877f, 19.277f)
                lineTo(16.019f, 18.382f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 18.382f, 17.5f, 18.046f, 17.5f, 17.632f)
                curveTo(17.5f, 17.218f, 17.164f, 16.882f, 16.75f, 16.882f)
                horizontalLineTo(16.256f)
                lineTo(16.494f, 15.382f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 15.382f, 18f, 15.046f, 18f, 14.632f)
                curveTo(18f, 14.217f, 17.664f, 13.882f, 17.25f, 13.882f)
                horizontalLineTo(16.731f)
                lineTo(16.893f, 12.857f)
                curveTo(16.958f, 12.448f, 16.679f, 12.064f, 16.27f, 11.999f)
                curveTo(15.861f, 11.934f, 15.477f, 12.213f, 15.412f, 12.623f)
                lineTo(15.212f, 13.882f)
                horizontalLineTo(13.731f)
                lineTo(13.893f, 12.857f)
                curveTo(13.958f, 12.448f, 13.679f, 12.064f, 13.27f, 11.999f)
                curveTo(12.861f, 11.934f, 12.477f, 12.213f, 12.412f, 12.623f)
                lineTo(12.212f, 13.882f)
                horizontalLineTo(11.25f)
                curveTo(10.836f, 13.882f, 10.5f, 14.217f, 10.5f, 14.632f)
                curveTo(10.5f, 15.046f, 10.836f, 15.382f, 11.25f, 15.382f)
                horizontalLineTo(11.975f)
                lineTo(11.738f, 16.882f)
                horizontalLineTo(10.75f)
                curveTo(10.336f, 16.882f, 10f, 17.218f, 10f, 17.632f)
                curveTo(10f, 18.046f, 10.336f, 18.382f, 10.75f, 18.382f)
                horizontalLineTo(11.5f)
                lineTo(11.395f, 19.042f)
                curveTo(11.331f, 19.452f, 11.61f, 19.836f, 12.019f, 19.901f)
                curveTo(12.428f, 19.965f, 12.812f, 19.686f, 12.877f, 19.277f)
                lineTo(13.019f, 18.382f)
                horizontalLineTo(14.5f)
                lineTo(14.395f, 19.042f)
                close()
            }
        }.build()

        return _DocumentPageBottomRight!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentPageBottomRight: ImageVector? = null

@Preview
@Composable
private fun DocumentPageBottomRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentPageBottomRight, contentDescription = null)
    }
}
