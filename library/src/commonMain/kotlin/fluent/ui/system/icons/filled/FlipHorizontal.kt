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

public val FluentIcons.Filled.FlipHorizontal: ImageVector
    get() {
        if (_FlipHorizontal != null) {
            return _FlipHorizontal!!
        }
        _FlipHorizontal = ImageVector.Builder(
            name = "Filled.FlipHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(21.837f, 19.547f)
                curveTo(21.652f, 19.83f, 21.337f, 20f, 21f, 20f)
                horizontalLineTo(14f)
                curveTo(13.448f, 20f, 13f, 19.552f, 13f, 19f)
                lineTo(13f, 3f)
                curveTo(13f, 2.527f, 13.332f, 2.118f, 13.795f, 2.021f)
                curveTo(14.259f, 1.924f, 14.726f, 2.166f, 14.916f, 2.599f)
                lineTo(21.916f, 18.599f)
                curveTo(22.051f, 18.909f, 22.022f, 19.265f, 21.837f, 19.547f)
                close()
                moveTo(15f, 7.781f)
                verticalLineTo(18f)
                horizontalLineTo(19.471f)
                lineTo(15f, 7.781f)
                close()
                moveTo(2.5f, 20f)
                curveTo(2.329f, 20f, 2.17f, 19.913f, 2.078f, 19.768f)
                curveTo(1.986f, 19.623f, 1.975f, 19.442f, 2.048f, 19.287f)
                lineTo(10.048f, 2.287f)
                curveTo(10.147f, 2.075f, 10.381f, 1.961f, 10.609f, 2.012f)
                curveTo(10.838f, 2.063f, 11f, 2.266f, 11f, 2.5f)
                lineTo(11f, 19.5f)
                curveTo(11f, 19.776f, 10.776f, 20f, 10.5f, 20f)
                horizontalLineTo(2.5f)
                close()
            }
        }.build()

        return _FlipHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _FlipHorizontal: ImageVector? = null

@Preview
@Composable
private fun FlipHorizontalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FlipHorizontal, contentDescription = null)
    }
}
