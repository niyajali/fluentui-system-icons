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

public val FluentIcons.Regular.InprivateAccount: ImageVector
    get() {
        if (_InprivateAccount != null) {
            return _InprivateAccount!!
        }
        _InprivateAccount = ImageVector.Builder(
            name = "Regular.InprivateAccount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.754f, 14f)
                curveTo(18.962f, 14f, 19.948f, 14.953f, 20.001f, 16.147f)
                lineTo(20f, 16.25f)
                horizontalLineTo(12f)
                lineTo(12f, 15.499f)
                lineTo(6.253f, 15.5f)
                curveTo(5.839f, 15.5f, 5.504f, 15.835f, 5.504f, 16.249f)
                verticalLineTo(16.826f)
                curveTo(5.504f, 17.362f, 5.695f, 17.88f, 6.043f, 18.288f)
                curveTo(7.296f, 19.755f, 9.262f, 20.501f, 12f, 20.501f)
                verticalLineTo(19.75f)
                lineTo(18.642f, 19.751f)
                curveTo(17.081f, 21.257f, 14.852f, 22.001f, 12f, 22.001f)
                curveTo(8.854f, 22.001f, 6.468f, 21.096f, 4.902f, 19.262f)
                curveTo(4.322f, 18.583f, 4.004f, 17.719f, 4.004f, 16.826f)
                verticalLineTo(16.249f)
                curveTo(4.004f, 15.007f, 5.011f, 14f, 6.253f, 14f)
                horizontalLineTo(17.754f)
                close()
                moveTo(19.47f, 18.751f)
                lineTo(12f, 18.75f)
                verticalLineTo(17.25f)
                lineTo(19.979f, 17.25f)
                curveTo(19.918f, 17.782f, 19.744f, 18.294f, 19.47f, 18.751f)
                close()
                moveTo(12f, 2f)
                curveTo(13.636f, 2f, 15.088f, 2.785f, 16f, 4f)
                lineTo(12f, 4f)
                verticalLineTo(3.5f)
                curveTo(10.067f, 3.5f, 8.5f, 5.067f, 8.5f, 7f)
                curveTo(8.5f, 8.933f, 10.067f, 10.5f, 12f, 10.5f)
                verticalLineTo(10f)
                lineTo(16f, 10.001f)
                curveTo(15.087f, 11.215f, 13.635f, 12f, 12f, 12f)
                curveTo(9.239f, 12f, 7f, 9.761f, 7f, 7f)
                curveTo(7f, 4.239f, 9.239f, 2f, 12f, 2f)
                close()
                moveTo(16.975f, 7.501f)
                curveTo(16.923f, 8.029f, 16.788f, 8.533f, 16.584f, 9.001f)
                lineTo(12f, 9f)
                verticalLineTo(7.5f)
                lineTo(16.975f, 7.501f)
                close()
                moveTo(16.584f, 5f)
                curveTo(16.788f, 5.468f, 16.923f, 5.972f, 16.976f, 6.5f)
                lineTo(12f, 6.5f)
                verticalLineTo(5f)
                lineTo(16.584f, 5f)
                close()
            }
        }.build()

        return _InprivateAccount!!
    }

@Suppress("ObjectPropertyName")
private var _InprivateAccount: ImageVector? = null

@Preview
@Composable
private fun InprivateAccountPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.InprivateAccount, contentDescription = null)
    }
}
