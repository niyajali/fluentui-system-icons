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

public val FluentIcons.Filled.BuildingRetail: ImageVector
    get() {
        if (_BuildingRetail != null) {
            return _BuildingRetail!!
        }
        _BuildingRetail = ImageVector.Builder(
            name = "Filled.BuildingRetail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.5f, 11.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(7.5f)
                close()
                moveTo(4f, 3f)
                curveTo(2.895f, 3f, 2f, 3.895f, 2f, 5f)
                curveTo(2f, 5.74f, 2.402f, 6.387f, 3f, 6.732f)
                verticalLineTo(20.25f)
                curveTo(3f, 20.664f, 3.336f, 21f, 3.75f, 21f)
                horizontalLineTo(6f)
                verticalLineTo(15.75f)
                curveTo(6f, 15.336f, 6.336f, 15f, 6.75f, 15f)
                horizontalLineTo(10.75f)
                curveTo(11.164f, 15f, 11.5f, 15.336f, 11.5f, 15.75f)
                verticalLineTo(21f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 21f, 21f, 20.664f, 21f, 20.25f)
                verticalLineTo(6.732f)
                curveTo(21.598f, 6.387f, 22f, 5.74f, 22f, 5f)
                curveTo(22f, 3.895f, 21.105f, 3f, 20f, 3f)
                horizontalLineTo(4f)
                close()
                moveTo(3.5f, 5f)
                curveTo(3.5f, 4.724f, 3.724f, 4.5f, 4f, 4.5f)
                horizontalLineTo(20f)
                curveTo(20.276f, 4.5f, 20.5f, 4.724f, 20.5f, 5f)
                curveTo(20.5f, 5.276f, 20.276f, 5.5f, 20f, 5.5f)
                horizontalLineTo(4f)
                curveTo(3.724f, 5.5f, 3.5f, 5.276f, 3.5f, 5f)
                close()
                moveTo(6.75f, 8f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 8f, 18f, 8.336f, 18f, 8.75f)
                verticalLineTo(12.25f)
                curveTo(18f, 12.664f, 17.664f, 13f, 17.25f, 13f)
                horizontalLineTo(6.75f)
                curveTo(6.336f, 13f, 6f, 12.664f, 6f, 12.25f)
                verticalLineTo(8.75f)
                curveTo(6f, 8.336f, 6.336f, 8f, 6.75f, 8f)
                close()
                moveTo(14.75f, 15f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 15f, 18f, 15.336f, 18f, 15.75f)
                verticalLineTo(18.25f)
                curveTo(18f, 18.664f, 17.664f, 19f, 17.25f, 19f)
                horizontalLineTo(14.75f)
                curveTo(14.336f, 19f, 14f, 18.664f, 14f, 18.25f)
                verticalLineTo(15.75f)
                curveTo(14f, 15.336f, 14.336f, 15f, 14.75f, 15f)
                close()
                moveTo(10f, 16.5f)
                verticalLineTo(21f)
                horizontalLineTo(7.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _BuildingRetail!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingRetail: ImageVector? = null

@Preview
@Composable
private fun BuildingRetailPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BuildingRetail, contentDescription = null)
    }
}
