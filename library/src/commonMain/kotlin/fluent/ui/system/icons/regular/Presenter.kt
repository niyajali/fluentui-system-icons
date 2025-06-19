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

public val FluentIcons.Regular.Presenter: ImageVector
    get() {
        if (_Presenter != null) {
            return _Presenter!!
        }
        _Presenter = ImageVector.Builder(
            name = "Regular.Presenter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.245f, 12.997f)
                curveTo(20.954f, 12.997f, 21.267f, 13.889f, 20.714f, 14.332f)
                lineTo(15.996f, 18.11f)
                verticalLineTo(19.754f)
                curveTo(15.996f, 20.997f, 14.988f, 22.004f, 13.746f, 22.004f)
                horizontalLineTo(10.25f)
                curveTo(9.008f, 22.004f, 8f, 20.997f, 8f, 19.754f)
                verticalLineTo(18.11f)
                lineTo(3.281f, 14.332f)
                curveTo(2.727f, 13.889f, 3.041f, 12.997f, 3.75f, 12.997f)
                horizontalLineTo(20.245f)
                close()
                moveTo(18.108f, 14.497f)
                horizontalLineTo(5.887f)
                lineTo(9.219f, 17.164f)
                curveTo(9.397f, 17.306f, 9.5f, 17.522f, 9.5f, 17.75f)
                verticalLineTo(19.754f)
                curveTo(9.5f, 20.168f, 9.836f, 20.504f, 10.25f, 20.504f)
                horizontalLineTo(13.746f)
                curveTo(14.16f, 20.504f, 14.496f, 20.168f, 14.496f, 19.754f)
                verticalLineTo(17.75f)
                curveTo(14.496f, 17.522f, 14.599f, 17.306f, 14.777f, 17.164f)
                lineTo(18.108f, 14.497f)
                close()
                moveTo(8.75f, 9f)
                horizontalLineTo(15.245f)
                curveTo(16.163f, 9f, 16.916f, 9.707f, 16.989f, 10.606f)
                lineTo(16.995f, 10.75f)
                verticalLineTo(12f)
                horizontalLineTo(15.495f)
                verticalLineTo(10.75f)
                curveTo(15.495f, 10.631f, 15.413f, 10.532f, 15.302f, 10.506f)
                lineTo(15.245f, 10.5f)
                horizontalLineTo(8.75f)
                curveTo(8.632f, 10.5f, 8.533f, 10.582f, 8.507f, 10.692f)
                lineTo(8.5f, 10.75f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(10.75f)
                curveTo(7f, 9.831f, 7.708f, 9.078f, 8.607f, 9.005f)
                lineTo(8.75f, 9f)
                horizontalLineTo(15.245f)
                horizontalLineTo(8.75f)
                close()
                moveTo(12f, 2f)
                curveTo(13.657f, 2f, 15f, 3.343f, 15f, 5f)
                curveTo(15f, 6.657f, 13.657f, 8f, 12f, 8f)
                curveTo(10.344f, 8f, 9f, 6.657f, 9f, 5f)
                curveTo(9f, 3.343f, 10.344f, 2f, 12f, 2f)
                close()
                moveTo(12f, 3.5f)
                curveTo(11.172f, 3.5f, 10.5f, 4.172f, 10.5f, 5f)
                curveTo(10.5f, 5.828f, 11.172f, 6.5f, 12f, 6.5f)
                curveTo(12.829f, 6.5f, 13.5f, 5.828f, 13.5f, 5f)
                curveTo(13.5f, 4.172f, 12.829f, 3.5f, 12f, 3.5f)
                close()
            }
        }.build()

        return _Presenter!!
    }

@Suppress("ObjectPropertyName")
private var _Presenter: ImageVector? = null

@Preview
@Composable
private fun PresenterPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Presenter, contentDescription = null)
    }
}
