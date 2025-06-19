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

public val FluentIcons.Filled.DataHistogram: ImageVector
    get() {
        if (_DataHistogram != null) {
            return _DataHistogram!!
        }
        _DataHistogram = ImageVector.Builder(
            name = "Filled.DataHistogram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9f, 5.23f)
                curveTo(9f, 3.988f, 10.007f, 2.98f, 11.25f, 2.98f)
                horizontalLineTo(12.75f)
                curveTo(13.993f, 2.98f, 15f, 3.988f, 15f, 5.23f)
                verticalLineTo(21f)
                curveTo(13.025f, 21f, 11.008f, 21f, 9f, 21f)
                verticalLineTo(5.23f)
                close()
                moveTo(7.5f, 10f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 10f, 3f, 11.008f, 3f, 12.25f)
                verticalLineTo(20.25f)
                curveTo(3f, 20.665f, 3.336f, 21f, 3.75f, 21f)
                horizontalLineTo(7.5f)
                verticalLineTo(10f)
                close()
                moveTo(16.5f, 21f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 21f, 21f, 20.665f, 21f, 20.25f)
                verticalLineTo(9.25f)
                curveTo(21f, 8.008f, 19.993f, 7f, 18.75f, 7f)
                horizontalLineTo(16.5f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _DataHistogram!!
    }

@Suppress("ObjectPropertyName")
private var _DataHistogram: ImageVector? = null

@Preview
@Composable
private fun DataHistogramPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DataHistogram, contentDescription = null)
    }
}
