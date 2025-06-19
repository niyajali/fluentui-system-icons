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

public val FluentIcons.Regular.DualScreenDesktop: ImageVector
    get() {
        if (_DualScreenDesktop != null) {
            return _DualScreenDesktop!!
        }
        _DualScreenDesktop = ImageVector.Builder(
            name = "Regular.DualScreenDesktop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.25f, 10f)
                curveTo(13.168f, 10f, 13.921f, 10.707f, 13.994f, 11.606f)
                lineTo(14f, 11.75f)
                verticalLineTo(20.25f)
                curveTo(14f, 21.168f, 13.293f, 21.921f, 12.394f, 21.994f)
                lineTo(12.25f, 22f)
                horizontalLineTo(3.75f)
                curveTo(2.832f, 22f, 2.079f, 21.293f, 2.006f, 20.393f)
                lineTo(2f, 20.25f)
                verticalLineTo(11.75f)
                curveTo(2f, 10.832f, 2.707f, 10.079f, 3.606f, 10.006f)
                lineTo(3.75f, 10f)
                horizontalLineTo(12.25f)
                close()
                moveTo(7.5f, 11.499f)
                lineTo(3.75f, 11.5f)
                curveTo(3.632f, 11.5f, 3.533f, 11.582f, 3.507f, 11.693f)
                lineTo(3.5f, 11.75f)
                verticalLineTo(20.25f)
                curveTo(3.5f, 20.368f, 3.582f, 20.468f, 3.693f, 20.493f)
                lineTo(3.75f, 20.5f)
                lineTo(7.5f, 20.499f)
                verticalLineTo(11.499f)
                close()
                moveTo(12.25f, 11.5f)
                lineTo(8.5f, 11.499f)
                verticalLineTo(20.499f)
                lineTo(12.25f, 20.5f)
                curveTo(12.368f, 20.5f, 12.467f, 20.418f, 12.493f, 20.307f)
                lineTo(12.5f, 20.25f)
                verticalLineTo(11.75f)
                curveTo(12.5f, 11.632f, 12.418f, 11.532f, 12.307f, 11.506f)
                lineTo(12.25f, 11.5f)
                close()
                moveTo(10.625f, 18f)
                curveTo(11.039f, 18f, 11.375f, 18.336f, 11.375f, 18.75f)
                curveTo(11.375f, 19.13f, 11.093f, 19.444f, 10.727f, 19.493f)
                lineTo(10.625f, 19.5f)
                horizontalLineTo(10.125f)
                curveTo(9.711f, 19.5f, 9.375f, 19.164f, 9.375f, 18.75f)
                curveTo(9.375f, 18.37f, 9.657f, 18.056f, 10.023f, 18.007f)
                lineTo(10.125f, 18f)
                horizontalLineTo(10.625f)
                close()
                moveTo(5.875f, 18f)
                curveTo(6.289f, 18f, 6.625f, 18.336f, 6.625f, 18.75f)
                curveTo(6.625f, 19.13f, 6.343f, 19.444f, 5.977f, 19.493f)
                lineTo(5.875f, 19.5f)
                horizontalLineTo(5.375f)
                curveTo(4.961f, 19.5f, 4.625f, 19.164f, 4.625f, 18.75f)
                curveTo(4.625f, 18.37f, 4.907f, 18.056f, 5.273f, 18.007f)
                lineTo(5.375f, 18f)
                horizontalLineTo(5.875f)
                close()
                moveTo(19.75f, 2f)
                curveTo(20.941f, 2f, 21.916f, 2.925f, 21.995f, 4.096f)
                lineTo(22f, 4.25f)
                verticalLineTo(13.25f)
                curveTo(22f, 14.441f, 21.075f, 15.416f, 19.904f, 15.495f)
                lineTo(19.75f, 15.5f)
                horizontalLineTo(17.004f)
                verticalLineTo(17.5f)
                horizontalLineTo(18.25f)
                curveTo(18.664f, 17.5f, 19f, 17.836f, 19f, 18.25f)
                curveTo(19f, 18.63f, 18.718f, 18.944f, 18.352f, 18.993f)
                lineTo(18.25f, 19f)
                horizontalLineTo(15f)
                verticalLineTo(17.5f)
                horizontalLineTo(15.504f)
                verticalLineTo(15.5f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(19.75f)
                curveTo(20.13f, 14f, 20.444f, 13.718f, 20.493f, 13.352f)
                lineTo(20.5f, 13.25f)
                verticalLineTo(4.25f)
                curveTo(20.5f, 3.836f, 20.164f, 3.5f, 19.75f, 3.5f)
                horizontalLineTo(6.25f)
                curveTo(5.87f, 3.5f, 5.557f, 3.782f, 5.507f, 4.148f)
                lineTo(5.5f, 4.25f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(4.25f)
                curveTo(4f, 3.059f, 4.925f, 2.084f, 6.096f, 2.005f)
                lineTo(6.25f, 2f)
                horizontalLineTo(19.75f)
                close()
            }
        }.build()

        return _DualScreenDesktop!!
    }

@Suppress("ObjectPropertyName")
private var _DualScreenDesktop: ImageVector? = null

@Preview
@Composable
private fun DualScreenDesktopPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DualScreenDesktop, contentDescription = null)
    }
}
