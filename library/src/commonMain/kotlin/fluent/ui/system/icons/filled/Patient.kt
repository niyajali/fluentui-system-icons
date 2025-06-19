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

public val FluentIcons.Filled.Patient: ImageVector
    get() {
        if (_Patient != null) {
            return _Patient!!
        }
        _Patient = ImageVector.Builder(
            name = "Filled.Patient",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.75f, 2f)
                curveTo(18.993f, 2f, 20f, 3.007f, 20f, 4.25f)
                verticalLineTo(19.755f)
                curveTo(20f, 20.997f, 18.993f, 22.005f, 17.75f, 22.005f)
                horizontalLineTo(6.25f)
                curveTo(5.007f, 22.005f, 4f, 20.997f, 4f, 19.755f)
                verticalLineTo(4.25f)
                curveTo(4f, 3.059f, 4.925f, 2.084f, 6.096f, 2.005f)
                lineTo(6.25f, 2f)
                horizontalLineTo(17.75f)
                close()
                moveTo(18.5f, 16f)
                horizontalLineTo(5.5f)
                verticalLineTo(19.755f)
                curveTo(5.5f, 20.169f, 5.836f, 20.505f, 6.25f, 20.505f)
                horizontalLineTo(17.75f)
                curveTo(18.164f, 20.505f, 18.5f, 20.169f, 18.5f, 19.755f)
                verticalLineTo(16f)
                close()
                moveTo(7.751f, 17.5f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 17.5f, 17f, 17.836f, 17f, 18.25f)
                curveTo(17f, 18.63f, 16.718f, 18.944f, 16.352f, 18.993f)
                lineTo(16.25f, 19f)
                horizontalLineTo(7.751f)
                curveTo(7.337f, 19f, 7.001f, 18.664f, 7.001f, 18.25f)
                curveTo(7.001f, 17.87f, 7.283f, 17.556f, 7.65f, 17.507f)
                lineTo(7.751f, 17.5f)
                horizontalLineTo(16.25f)
                horizontalLineTo(7.751f)
                close()
                moveTo(17.75f, 3.5f)
                horizontalLineTo(6.25f)
                lineTo(6.148f, 3.507f)
                curveTo(5.782f, 3.557f, 5.5f, 3.87f, 5.5f, 4.25f)
                verticalLineTo(14.5f)
                horizontalLineTo(8f)
                verticalLineTo(12.245f)
                curveTo(8f, 11.598f, 8.492f, 11.066f, 9.122f, 11.002f)
                lineTo(9.25f, 10.995f)
                horizontalLineTo(14.75f)
                curveTo(15.397f, 10.995f, 15.929f, 11.487f, 15.993f, 12.118f)
                lineTo(16f, 12.245f)
                verticalLineTo(14.5f)
                horizontalLineTo(18.5f)
                verticalLineTo(4.25f)
                curveTo(18.5f, 3.836f, 18.164f, 3.5f, 17.75f, 3.5f)
                close()
                moveTo(12f, 4.996f)
                curveTo(13.381f, 4.996f, 14.5f, 6.115f, 14.5f, 7.496f)
                curveTo(14.5f, 8.876f, 13.381f, 9.996f, 12f, 9.996f)
                curveTo(10.619f, 9.996f, 9.5f, 8.876f, 9.5f, 7.496f)
                curveTo(9.5f, 6.115f, 10.619f, 4.996f, 12f, 4.996f)
                close()
            }
        }.build()

        return _Patient!!
    }

@Suppress("ObjectPropertyName")
private var _Patient: ImageVector? = null

@Preview
@Composable
private fun PatientPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Patient, contentDescription = null)
    }
}
