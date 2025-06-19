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

public val FluentIcons.Filled.CropArrowRotate: ImageVector
    get() {
        if (_CropArrowRotate != null) {
            return _CropArrowRotate!!
        }
        _CropArrowRotate = ImageVector.Builder(
            name = "Filled.CropArrowRotate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.33f, 7.557f)
                curveTo(6.77f, 5.411f, 9.22f, 4f, 12f, 4f)
                curveTo(14.033f, 4f, 15.89f, 4.755f, 17.304f, 6f)
                horizontalLineTo(17f)
                curveTo(16.448f, 6f, 16f, 6.448f, 16f, 7f)
                curveTo(16f, 7.552f, 16.448f, 8f, 17f, 8f)
                horizontalLineTo(19.486f)
                curveTo(19.496f, 8f, 19.506f, 8f, 19.515f, 8f)
                horizontalLineTo(20f)
                curveTo(20.552f, 8f, 21f, 7.552f, 21f, 7f)
                verticalLineTo(4f)
                curveTo(21f, 3.448f, 20.552f, 3f, 20f, 3f)
                curveTo(19.448f, 3f, 19f, 3.448f, 19f, 4f)
                verticalLineTo(4.846f)
                curveTo(17.195f, 3.086f, 14.724f, 2f, 12f, 2f)
                curveTo(8.526f, 2f, 5.466f, 3.765f, 3.67f, 6.443f)
                curveTo(3.362f, 6.902f, 3.484f, 7.523f, 3.943f, 7.83f)
                curveTo(4.402f, 8.138f, 5.023f, 8.016f, 5.33f, 7.557f)
                close()
                moveTo(5f, 19.154f)
                verticalLineTo(20f)
                curveTo(5f, 20.552f, 4.552f, 21f, 4f, 21f)
                curveTo(3.448f, 21f, 3f, 20.552f, 3f, 20f)
                verticalLineTo(17f)
                curveTo(3f, 16.448f, 3.448f, 16f, 4f, 16f)
                horizontalLineTo(4.485f)
                curveTo(4.494f, 16f, 4.504f, 16f, 4.513f, 16f)
                horizontalLineTo(7f)
                curveTo(7.552f, 16f, 8f, 16.448f, 8f, 17f)
                curveTo(8f, 17.552f, 7.552f, 18f, 7f, 18f)
                horizontalLineTo(6.696f)
                curveTo(8.11f, 19.245f, 9.966f, 20f, 12f, 20f)
                curveTo(14.78f, 20f, 17.23f, 18.589f, 18.67f, 16.443f)
                curveTo(18.977f, 15.984f, 19.598f, 15.862f, 20.057f, 16.17f)
                curveTo(20.516f, 16.477f, 20.638f, 17.098f, 20.33f, 17.557f)
                curveTo(18.535f, 20.235f, 15.474f, 22f, 12f, 22f)
                curveTo(9.276f, 22f, 6.805f, 20.914f, 5f, 19.154f)
                close()
                moveTo(10f, 7f)
                curveTo(10f, 6.448f, 9.552f, 6f, 9f, 6f)
                curveTo(8.448f, 6f, 8f, 6.448f, 8f, 7f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                curveTo(6.448f, 8f, 6f, 8.448f, 6f, 9f)
                curveTo(6f, 9.552f, 6.448f, 10f, 7f, 10f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                curveTo(8f, 14.657f, 9.343f, 16f, 11f, 16f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                curveTo(14f, 17.552f, 14.448f, 18f, 15f, 18f)
                curveTo(15.552f, 18f, 16f, 17.552f, 16f, 17f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                curveTo(17.552f, 16f, 18f, 15.552f, 18f, 15f)
                curveTo(18f, 14.448f, 17.552f, 14f, 17f, 14f)
                horizontalLineTo(11f)
                curveTo(10.448f, 14f, 10f, 13.552f, 10f, 13f)
                verticalLineTo(7f)
                close()
                moveTo(14f, 10.882f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(10.882f)
                curveTo(16f, 9.29f, 14.71f, 8f, 13.118f, 8f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(13.118f)
                curveTo(13.605f, 10f, 14f, 10.395f, 14f, 10.882f)
                close()
            }
        }.build()

        return _CropArrowRotate!!
    }

@Suppress("ObjectPropertyName")
private var _CropArrowRotate: ImageVector? = null

@Preview
@Composable
private fun CropArrowRotatePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CropArrowRotate, contentDescription = null)
    }
}
