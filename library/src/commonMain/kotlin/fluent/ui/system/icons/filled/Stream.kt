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

public val FluentIcons.Filled.Stream: ImageVector
    get() {
        if (_Stream != null) {
            return _Stream!!
        }
        _Stream = ImageVector.Builder(
            name = "Filled.Stream",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9f, 11f)
                curveTo(9f, 7.134f, 12.134f, 4f, 16f, 4f)
                horizontalLineTo(17.5f)
                curveTo(18.052f, 4f, 18.5f, 3.552f, 18.5f, 3f)
                curveTo(18.5f, 2.448f, 18.052f, 2f, 17.5f, 2f)
                horizontalLineTo(16f)
                curveTo(11.029f, 2f, 7f, 6.029f, 7f, 11f)
                curveTo(7f, 11.552f, 6.552f, 12f, 6f, 12f)
                horizontalLineTo(3f)
                curveTo(2.448f, 12f, 2f, 12.448f, 2f, 13f)
                curveTo(2f, 13.552f, 2.448f, 14f, 3f, 14f)
                horizontalLineTo(6f)
                curveTo(7.657f, 14f, 9f, 12.657f, 9f, 11f)
                close()
                moveTo(17f, 8f)
                curveTo(14.791f, 8f, 13f, 9.791f, 13f, 12f)
                curveTo(13f, 15.314f, 10.314f, 18f, 7f, 18f)
                horizontalLineTo(3f)
                curveTo(2.448f, 18f, 2f, 17.552f, 2f, 17f)
                curveTo(2f, 16.448f, 2.448f, 16f, 3f, 16f)
                horizontalLineTo(7f)
                curveTo(9.209f, 16f, 11f, 14.209f, 11f, 12f)
                curveTo(11f, 8.686f, 13.686f, 6f, 17f, 6f)
                horizontalLineTo(21f)
                curveTo(21.552f, 6f, 22f, 6.448f, 22f, 7f)
                curveTo(22f, 7.552f, 21.552f, 8f, 21f, 8f)
                horizontalLineTo(17f)
                close()
                moveTo(18f, 12f)
                curveTo(17.448f, 12f, 17f, 12.448f, 17f, 13f)
                curveTo(17f, 17.971f, 12.971f, 22f, 8f, 22f)
                horizontalLineTo(6f)
                curveTo(5.448f, 22f, 5f, 21.552f, 5f, 21f)
                curveTo(5f, 20.448f, 5.448f, 20f, 6f, 20f)
                horizontalLineTo(8f)
                curveTo(11.866f, 20f, 15f, 16.866f, 15f, 13f)
                curveTo(15f, 11.343f, 16.343f, 10f, 18f, 10f)
                horizontalLineTo(21f)
                curveTo(21.552f, 10f, 22f, 10.448f, 22f, 11f)
                curveTo(22f, 11.552f, 21.552f, 12f, 21f, 12f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _Stream!!
    }

@Suppress("ObjectPropertyName")
private var _Stream: ImageVector? = null

@Preview
@Composable
private fun StreamPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Stream, contentDescription = null)
    }
}
