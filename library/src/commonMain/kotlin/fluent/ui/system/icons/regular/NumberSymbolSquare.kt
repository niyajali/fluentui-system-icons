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

public val FluentIcons.Regular.NumberSymbolSquare: ImageVector
    get() {
        if (_NumberSymbolSquare != null) {
            return _NumberSymbolSquare!!
        }
        _NumberSymbolSquare = ImageVector.Builder(
            name = "Regular.NumberSymbolSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.898f, 7.515f)
                curveTo(11.304f, 7.596f, 11.567f, 7.991f, 11.486f, 8.397f)
                lineTo(11.266f, 9.5f)
                horizontalLineTo(13.736f)
                lineTo(14.015f, 8.103f)
                curveTo(14.097f, 7.697f, 14.492f, 7.433f, 14.898f, 7.515f)
                curveTo(15.304f, 7.596f, 15.567f, 7.991f, 15.486f, 8.397f)
                lineTo(15.266f, 9.5f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 9.5f, 17f, 9.836f, 17f, 10.25f)
                curveTo(17f, 10.664f, 16.664f, 11f, 16.25f, 11f)
                horizontalLineTo(14.965f)
                lineTo(14.565f, 13f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 13f, 16.5f, 13.336f, 16.5f, 13.75f)
                curveTo(16.5f, 14.164f, 16.164f, 14.5f, 15.75f, 14.5f)
                horizontalLineTo(14.265f)
                lineTo(13.986f, 15.898f)
                curveTo(13.904f, 16.304f, 13.509f, 16.567f, 13.103f, 16.486f)
                curveTo(12.697f, 16.404f, 12.434f, 16.009f, 12.515f, 15.603f)
                lineTo(12.735f, 14.5f)
                horizontalLineTo(10.265f)
                lineTo(9.986f, 15.898f)
                curveTo(9.904f, 16.304f, 9.509f, 16.567f, 9.103f, 16.486f)
                curveTo(8.697f, 16.404f, 8.433f, 16.009f, 8.515f, 15.603f)
                lineTo(8.735f, 14.5f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 14.5f, 7f, 14.164f, 7f, 13.75f)
                curveTo(7f, 13.336f, 7.336f, 13f, 7.75f, 13f)
                horizontalLineTo(9.036f)
                lineTo(9.436f, 11f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 11f, 7.5f, 10.664f, 7.5f, 10.25f)
                curveTo(7.5f, 9.836f, 7.836f, 9.5f, 8.25f, 9.5f)
                horizontalLineTo(9.736f)
                lineTo(10.015f, 8.103f)
                curveTo(10.097f, 7.697f, 10.492f, 7.433f, 10.898f, 7.515f)
                close()
                moveTo(10.565f, 13f)
                horizontalLineTo(13.035f)
                lineTo(13.436f, 11f)
                horizontalLineTo(10.965f)
                lineTo(10.565f, 13f)
                close()
                moveTo(3f, 6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.25f, 4.5f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 19.5f, 19.5f, 18.716f, 19.5f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(6.25f)
                close()
            }
        }.build()

        return _NumberSymbolSquare!!
    }

@Suppress("ObjectPropertyName")
private var _NumberSymbolSquare: ImageVector? = null

@Preview
@Composable
private fun NumberSymbolSquarePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.NumberSymbolSquare, contentDescription = null)
    }
}
