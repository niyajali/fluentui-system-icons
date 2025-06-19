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

public val FluentIcons.Regular.Flow: ImageVector
    get() {
        if (_Flow != null) {
            return _Flow!!
        }
        _Flow = ImageVector.Builder(
            name = "Regular.Flow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18f, 5.5f)
                curveTo(16.619f, 5.5f, 15.5f, 6.619f, 15.5f, 8f)
                curveTo(15.5f, 9.381f, 16.619f, 10.5f, 18f, 10.5f)
                curveTo(19.381f, 10.5f, 20.5f, 9.381f, 20.5f, 8f)
                curveTo(20.5f, 6.619f, 19.381f, 5.5f, 18f, 5.5f)
                close()
                moveTo(14.065f, 7.279f)
                curveTo(14.404f, 5.414f, 16.037f, 4f, 18f, 4f)
                curveTo(20.209f, 4f, 22f, 5.791f, 22f, 8f)
                curveTo(22f, 10.209f, 20.209f, 12f, 18f, 12f)
                curveTo(16.065f, 12f, 14.451f, 10.626f, 14.08f, 8.801f)
                curveTo(13.316f, 8.989f, 12.75f, 9.678f, 12.75f, 10.5f)
                verticalLineTo(13.5f)
                curveTo(12.75f, 15.147f, 11.524f, 16.508f, 9.935f, 16.721f)
                curveTo(9.596f, 18.586f, 7.963f, 20f, 6f, 20f)
                curveTo(3.791f, 20f, 2f, 18.209f, 2f, 16f)
                curveTo(2f, 13.791f, 3.791f, 12f, 6f, 12f)
                curveTo(7.935f, 12f, 9.549f, 13.374f, 9.92f, 15.199f)
                curveTo(10.684f, 15.011f, 11.25f, 14.322f, 11.25f, 13.5f)
                verticalLineTo(10.5f)
                curveTo(11.25f, 8.853f, 12.476f, 7.492f, 14.065f, 7.279f)
                close()
                moveTo(6f, 13.5f)
                curveTo(4.619f, 13.5f, 3.5f, 14.619f, 3.5f, 16f)
                curveTo(3.5f, 17.381f, 4.619f, 18.5f, 6f, 18.5f)
                curveTo(7.381f, 18.5f, 8.5f, 17.381f, 8.5f, 16f)
                curveTo(8.5f, 14.619f, 7.381f, 13.5f, 6f, 13.5f)
                close()
            }
        }.build()

        return _Flow!!
    }

@Suppress("ObjectPropertyName")
private var _Flow: ImageVector? = null

@Preview
@Composable
private fun FlowPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Flow, contentDescription = null)
    }
}
