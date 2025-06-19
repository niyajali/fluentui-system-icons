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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.ArrowAutofitUp: ImageVector
    get() {
        if (_ArrowAutofitUp != null) {
            return _ArrowAutofitUp!!
        }
        _ArrowAutofitUp = ImageVector.Builder(
            name = "Regular.ArrowAutofitUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.22f, 6.781f)
                curveTo(12.953f, 6.515f, 12.929f, 6.098f, 13.147f, 5.805f)
                lineTo(13.22f, 5.72f)
                lineTo(15.587f, 3.35f)
                curveTo(15.713f, 3.142f, 15.963f, 3f, 16.251f, 3f)
                curveTo(16.503f, 3f, 16.726f, 3.109f, 16.862f, 3.276f)
                lineTo(16.915f, 3.351f)
                lineTo(19.282f, 5.72f)
                lineTo(19.355f, 5.805f)
                curveTo(19.548f, 6.066f, 19.551f, 6.424f, 19.362f, 6.687f)
                lineTo(19.282f, 6.781f)
                lineTo(19.198f, 6.854f)
                curveTo(18.937f, 7.047f, 18.579f, 7.05f, 18.315f, 6.861f)
                lineTo(18.221f, 6.781f)
                lineTo(17f, 5.56f)
                verticalLineTo(20.344f)
                lineTo(16.993f, 20.433f)
                curveTo(16.943f, 20.753f, 16.63f, 21f, 16.25f, 21f)
                curveTo(15.87f, 21f, 15.557f, 20.753f, 15.507f, 20.433f)
                lineTo(15.5f, 20.344f)
                verticalLineTo(5.56f)
                lineTo(14.28f, 6.781f)
                lineTo(14.196f, 6.854f)
                curveTo(13.903f, 7.072f, 13.486f, 7.047f, 13.22f, 6.781f)
                close()
                moveTo(6.25f, 3.992f)
                curveTo(5.007f, 3.992f, 4f, 5f, 4f, 6.242f)
                verticalLineTo(17.742f)
                curveTo(4f, 18.985f, 5.007f, 19.992f, 6.25f, 19.992f)
                horizontalLineTo(12.25f)
                curveTo(12.664f, 19.992f, 13f, 19.656f, 13f, 19.242f)
                curveTo(13f, 18.828f, 12.664f, 18.492f, 12.25f, 18.492f)
                horizontalLineTo(6.25f)
                curveTo(5.836f, 18.492f, 5.5f, 18.156f, 5.5f, 17.742f)
                verticalLineTo(6.242f)
                curveTo(5.5f, 5.828f, 5.836f, 5.492f, 6.25f, 5.492f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 5.492f, 11f, 5.156f, 11f, 4.742f)
                curveTo(11f, 4.328f, 10.664f, 3.992f, 10.25f, 3.992f)
                horizontalLineTo(6.25f)
                close()
            }
        }.build()

        return _ArrowAutofitUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowAutofitUp: ImageVector? = null

@Preview
@Composable
private fun ArrowAutofitUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowAutofitUp, contentDescription = null)
    }
}
