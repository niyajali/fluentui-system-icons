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

public val FluentIcons.Filled.ShieldCheckmark: ImageVector
    get() {
        if (_ShieldCheckmark != null) {
            return _ShieldCheckmark!!
        }
        _ShieldCheckmark = ImageVector.Builder(
            name = "Filled.ShieldCheckmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3f, 5.75f)
                curveTo(3f, 5.336f, 3.336f, 5f, 3.75f, 5f)
                curveTo(6.413f, 5f, 9.008f, 4.057f, 11.55f, 2.15f)
                curveTo(11.817f, 1.95f, 12.183f, 1.95f, 12.45f, 2.15f)
                curveTo(14.992f, 4.057f, 17.587f, 5f, 20.25f, 5f)
                curveTo(20.664f, 5f, 21f, 5.336f, 21f, 5.75f)
                verticalLineTo(11f)
                curveTo(21f, 11.338f, 20.986f, 11.67f, 20.959f, 11.996f)
                curveTo(19.958f, 11.365f, 18.771f, 11f, 17.5f, 11f)
                curveTo(13.91f, 11f, 11f, 13.91f, 11f, 17.5f)
                curveTo(11f, 19.151f, 11.616f, 20.658f, 12.63f, 21.805f)
                curveTo(12.513f, 21.853f, 12.394f, 21.901f, 12.275f, 21.948f)
                curveTo(12.098f, 22.017f, 11.902f, 22.017f, 11.725f, 21.948f)
                curveTo(5.958f, 19.676f, 3f, 16.001f, 3f, 11f)
                verticalLineTo(5.75f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                close()
                moveTo(20.854f, 15.146f)
                curveTo(21.049f, 15.342f, 21.049f, 15.658f, 20.854f, 15.854f)
                lineTo(16.854f, 19.854f)
                curveTo(16.658f, 20.049f, 16.342f, 20.049f, 16.146f, 19.854f)
                lineTo(14.146f, 17.854f)
                curveTo(13.951f, 17.658f, 13.951f, 17.342f, 14.146f, 17.146f)
                curveTo(14.342f, 16.951f, 14.658f, 16.951f, 14.854f, 17.146f)
                lineTo(16.5f, 18.793f)
                lineTo(20.146f, 15.146f)
                curveTo(20.342f, 14.951f, 20.658f, 14.951f, 20.854f, 15.146f)
                close()
            }
        }.build()

        return _ShieldCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldCheckmark: ImageVector? = null

@Preview
@Composable
private fun ShieldCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ShieldCheckmark, contentDescription = null)
    }
}
