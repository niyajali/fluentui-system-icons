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

public val FluentIcons.Filled.ScanDash: ImageVector
    get() {
        if (_ScanDash != null) {
            return _ScanDash!!
        }
        _ScanDash = ImageVector.Builder(
            name = "Filled.ScanDash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.25f, 4f)
                curveTo(4.56f, 4f, 4f, 4.56f, 4f, 5.25f)
                verticalLineTo(8f)
                curveTo(4f, 8.552f, 3.552f, 9f, 3f, 9f)
                curveTo(2.448f, 9f, 2f, 8.552f, 2f, 8f)
                verticalLineTo(5.25f)
                curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
                horizontalLineTo(8f)
                curveTo(8.552f, 2f, 9f, 2.448f, 9f, 3f)
                curveTo(9f, 3.552f, 8.552f, 4f, 8f, 4f)
                horizontalLineTo(5.25f)
                close()
                moveTo(5.25f, 20f)
                curveTo(4.56f, 20f, 4f, 19.44f, 4f, 18.75f)
                verticalLineTo(16f)
                curveTo(4f, 15.448f, 3.552f, 15f, 3f, 15f)
                curveTo(2.448f, 15f, 2f, 15.448f, 2f, 16f)
                verticalLineTo(18.75f)
                curveTo(2f, 20.545f, 3.455f, 22f, 5.25f, 22f)
                horizontalLineTo(8f)
                curveTo(8.552f, 22f, 9f, 21.552f, 9f, 21f)
                curveTo(9f, 20.448f, 8.552f, 20f, 8f, 20f)
                horizontalLineTo(5.25f)
                close()
                moveTo(20f, 5.25f)
                curveTo(20f, 4.56f, 19.44f, 4f, 18.75f, 4f)
                horizontalLineTo(16f)
                curveTo(15.448f, 4f, 15f, 3.552f, 15f, 3f)
                curveTo(15f, 2.448f, 15.448f, 2f, 16f, 2f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 2f, 22f, 3.455f, 22f, 5.25f)
                verticalLineTo(8f)
                curveTo(22f, 8.552f, 21.552f, 9f, 21f, 9f)
                curveTo(20.448f, 9f, 20f, 8.552f, 20f, 8f)
                verticalLineTo(5.25f)
                close()
                moveTo(18.75f, 20f)
                curveTo(19.44f, 20f, 20f, 19.44f, 20f, 18.75f)
                verticalLineTo(16f)
                curveTo(20f, 15.448f, 20.448f, 15f, 21f, 15f)
                curveTo(21.552f, 15f, 22f, 15.448f, 22f, 16f)
                verticalLineTo(18.75f)
                curveTo(22f, 20.545f, 20.545f, 22f, 18.75f, 22f)
                horizontalLineTo(16f)
                curveTo(15.448f, 22f, 15f, 21.552f, 15f, 21f)
                curveTo(15f, 20.448f, 15.448f, 20f, 16f, 20f)
                horizontalLineTo(18.75f)
                close()
                moveTo(7f, 12f)
                curveTo(7f, 11.448f, 7.448f, 11f, 8f, 11f)
                horizontalLineTo(16f)
                curveTo(16.552f, 11f, 17f, 11.448f, 17f, 12f)
                curveTo(17f, 12.552f, 16.552f, 13f, 16f, 13f)
                horizontalLineTo(8f)
                curveTo(7.448f, 13f, 7f, 12.552f, 7f, 12f)
                close()
            }
        }.build()

        return _ScanDash!!
    }

@Suppress("ObjectPropertyName")
private var _ScanDash: ImageVector? = null

@Preview
@Composable
private fun ScanDashPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ScanDash, contentDescription = null)
    }
}
