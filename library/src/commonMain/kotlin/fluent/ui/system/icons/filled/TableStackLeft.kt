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

public val FluentIcons.Filled.TableStackLeft: ImageVector
    get() {
        if (_TableStackLeft != null) {
            return _TableStackLeft!!
        }
        _TableStackLeft = ImageVector.Builder(
            name = "Filled.TableStackLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(16f, 21f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
                verticalLineTo(16f)
                lineTo(16f, 16f)
                lineTo(16f, 21f)
                close()
                moveTo(16f, 14.5f)
                lineTo(21f, 14.5f)
                lineTo(21f, 9.5f)
                lineTo(16f, 9.5f)
                lineTo(16f, 14.5f)
                close()
                moveTo(14.5f, 9.5f)
                lineTo(14.5f, 14.5f)
                lineTo(9.5f, 14.5f)
                lineTo(9.5f, 9.5f)
                lineTo(14.5f, 9.5f)
                close()
                moveTo(16f, 8f)
                lineTo(21f, 8f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(16f)
                lineTo(16f, 8f)
                close()
                moveTo(14.5f, 3f)
                lineTo(14.5f, 8f)
                lineTo(9.5f, 8f)
                lineTo(9.5f, 3.75f)
                curveTo(9.5f, 3.551f, 9.579f, 3.36f, 9.72f, 3.22f)
                curveTo(9.86f, 3.079f, 10.051f, 3f, 10.25f, 3f)
                horizontalLineTo(14.5f)
                close()
                moveTo(14.5f, 16f)
                lineTo(14.5f, 21f)
                lineTo(10.25f, 21f)
                curveTo(9.836f, 21f, 9.5f, 20.664f, 9.5f, 20.25f)
                lineTo(9.5f, 16f)
                lineTo(14.5f, 16f)
                close()
                moveTo(4.5f, 3.75f)
                curveTo(4.5f, 3.336f, 4.164f, 3f, 3.75f, 3f)
                curveTo(3.336f, 3f, 3f, 3.336f, 3f, 3.75f)
                verticalLineTo(20.25f)
                curveTo(3f, 20.664f, 3.336f, 21f, 3.75f, 21f)
                curveTo(4.164f, 21f, 4.5f, 20.664f, 4.5f, 20.25f)
                lineTo(4.5f, 3.75f)
                close()
            }
        }.build()

        return _TableStackLeft!!
    }

@Suppress("ObjectPropertyName")
private var _TableStackLeft: ImageVector? = null

@Preview
@Composable
private fun TableStackLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableStackLeft, contentDescription = null)
    }
}
