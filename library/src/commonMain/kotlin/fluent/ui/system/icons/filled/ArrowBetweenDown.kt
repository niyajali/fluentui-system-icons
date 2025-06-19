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

public val FluentIcons.Filled.ArrowBetweenDown: ImageVector
    get() {
        if (_ArrowBetweenDown != null) {
            return _ArrowBetweenDown!!
        }
        _ArrowBetweenDown = ImageVector.Builder(
            name = "Filled.ArrowBetweenDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.5f, 2.25f)
                curveTo(6.5f, 1.698f, 6.052f, 1.25f, 5.5f, 1.25f)
                curveTo(4.948f, 1.25f, 4.5f, 1.698f, 4.5f, 2.25f)
                verticalLineTo(2.5f)
                curveTo(4.5f, 3.881f, 5.619f, 5f, 7f, 5f)
                horizontalLineTo(17f)
                curveTo(18.381f, 5f, 19.5f, 3.881f, 19.5f, 2.5f)
                verticalLineTo(2.25f)
                curveTo(19.5f, 1.698f, 19.052f, 1.25f, 18.5f, 1.25f)
                curveTo(17.948f, 1.25f, 17.5f, 1.698f, 17.5f, 2.25f)
                verticalLineTo(2.5f)
                curveTo(17.5f, 2.776f, 17.276f, 3f, 17f, 3f)
                horizontalLineTo(7f)
                curveTo(6.724f, 3f, 6.5f, 2.776f, 6.5f, 2.5f)
                verticalLineTo(2.25f)
                close()
                moveTo(12f, 6.25f)
                curveTo(12.552f, 6.25f, 13f, 6.698f, 13f, 7.25f)
                verticalLineTo(14.336f)
                lineTo(15.793f, 11.543f)
                curveTo(16.183f, 11.152f, 16.817f, 11.152f, 17.207f, 11.543f)
                curveTo(17.598f, 11.933f, 17.598f, 12.567f, 17.207f, 12.957f)
                lineTo(12.707f, 17.457f)
                curveTo(12.317f, 17.848f, 11.683f, 17.848f, 11.293f, 17.457f)
                lineTo(6.793f, 12.957f)
                curveTo(6.402f, 12.567f, 6.402f, 11.933f, 6.793f, 11.543f)
                curveTo(7.183f, 11.152f, 7.817f, 11.152f, 8.207f, 11.543f)
                lineTo(11f, 14.336f)
                verticalLineTo(7.25f)
                curveTo(11f, 6.698f, 11.448f, 6.25f, 12f, 6.25f)
                close()
                moveTo(4.5f, 21.5f)
                curveTo(4.5f, 20.119f, 5.619f, 19f, 7f, 19f)
                horizontalLineTo(17f)
                curveTo(18.381f, 19f, 19.5f, 20.119f, 19.5f, 21.5f)
                verticalLineTo(21.75f)
                curveTo(19.5f, 22.302f, 19.052f, 22.75f, 18.5f, 22.75f)
                curveTo(17.948f, 22.75f, 17.5f, 22.302f, 17.5f, 21.75f)
                verticalLineTo(21.5f)
                curveTo(17.5f, 21.224f, 17.276f, 21f, 17f, 21f)
                horizontalLineTo(7f)
                curveTo(6.724f, 21f, 6.5f, 21.224f, 6.5f, 21.5f)
                verticalLineTo(21.75f)
                curveTo(6.5f, 22.302f, 6.052f, 22.75f, 5.5f, 22.75f)
                curveTo(4.948f, 22.75f, 4.5f, 22.302f, 4.5f, 21.75f)
                verticalLineTo(21.5f)
                close()
            }
        }.build()

        return _ArrowBetweenDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBetweenDown: ImageVector? = null

@Preview
@Composable
private fun ArrowBetweenDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowBetweenDown, contentDescription = null)
    }
}
