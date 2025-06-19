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

public val FluentIcons.Filled.TableSimpleMultiple: ImageVector
    get() {
        if (_TableSimpleMultiple != null) {
            return _TableSimpleMultiple!!
        }
        _TableSimpleMultiple = ImageVector.Builder(
            name = "Filled.TableSimpleMultiple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(15.75f, 19f)
                horizontalLineTo(11.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(19f)
                verticalLineTo(15.75f)
                curveTo(19f, 17.545f, 17.545f, 19f, 15.75f, 19f)
                close()
                moveTo(19f, 10f)
                horizontalLineTo(11.5f)
                verticalLineTo(2f)
                horizontalLineTo(15.75f)
                curveTo(17.545f, 2f, 19f, 3.455f, 19f, 5.25f)
                verticalLineTo(10f)
                close()
                moveTo(10f, 10f)
                verticalLineTo(2f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 2f, 2f, 3.455f, 2f, 5.25f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                close()
                moveTo(10f, 19f)
                verticalLineTo(11.5f)
                horizontalLineTo(2f)
                verticalLineTo(15.75f)
                curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
                horizontalLineTo(10f)
                close()
                moveTo(8.251f, 22f)
                curveTo(6.899f, 22f, 5.74f, 21.174f, 5.25f, 20f)
                horizontalLineTo(15.752f)
                curveTo(18.099f, 20f, 20.002f, 18.097f, 20.002f, 15.75f)
                verticalLineTo(5.25f)
                curveTo(21.176f, 5.74f, 22.001f, 6.898f, 22.001f, 8.25f)
                verticalLineTo(16.5f)
                curveTo(22.001f, 19.538f, 19.538f, 22f, 16.501f, 22f)
                horizontalLineTo(8.251f)
                close()
            }
        }.build()

        return _TableSimpleMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _TableSimpleMultiple: ImageVector? = null

@Preview
@Composable
private fun TableSimpleMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableSimpleMultiple, contentDescription = null)
    }
}
