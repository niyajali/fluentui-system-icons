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

public val FluentIcons.Filled.ArrowStepIn: ImageVector
    get() {
        if (_ArrowStepIn != null) {
            return _ArrowStepIn!!
        }
        _ArrowStepIn = ImageVector.Builder(
            name = "Filled.ArrowStepIn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                curveTo(12.414f, 2f, 12.75f, 2.336f, 12.75f, 2.75f)
                verticalLineTo(12.006f)
                lineTo(16.234f, 8.706f)
                curveTo(16.535f, 8.421f, 17.01f, 8.433f, 17.295f, 8.734f)
                curveTo(17.579f, 9.035f, 17.566f, 9.51f, 17.266f, 9.794f)
                lineTo(12.516f, 14.295f)
                curveTo(12.226f, 14.568f, 11.774f, 14.568f, 11.484f, 14.295f)
                lineTo(6.734f, 9.794f)
                curveTo(6.433f, 9.51f, 6.421f, 9.035f, 6.706f, 8.734f)
                curveTo(6.99f, 8.433f, 7.465f, 8.421f, 7.766f, 8.706f)
                lineTo(11.25f, 12.006f)
                verticalLineTo(2.75f)
                curveTo(11.25f, 2.336f, 11.586f, 2f, 12f, 2f)
                close()
                moveTo(15f, 19f)
                curveTo(15f, 20.657f, 13.657f, 22f, 12f, 22f)
                curveTo(10.343f, 22f, 9f, 20.657f, 9f, 19f)
                curveTo(9f, 17.343f, 10.343f, 16f, 12f, 16f)
                curveTo(13.657f, 16f, 15f, 17.343f, 15f, 19f)
                close()
            }
        }.build()

        return _ArrowStepIn!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowStepIn: ImageVector? = null

@Preview
@Composable
private fun ArrowStepInPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowStepIn, contentDescription = null)
    }
}
