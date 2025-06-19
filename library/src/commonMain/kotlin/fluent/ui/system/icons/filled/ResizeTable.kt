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

public val FluentIcons.Filled.ResizeTable: ImageVector
    get() {
        if (_ResizeTable != null) {
            return _ResizeTable!!
        }
        _ResizeTable = ImageVector.Builder(
            name = "Filled.ResizeTable",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.25f, 2f)
                horizontalLineTo(10.25f)
                curveTo(10.664f, 2f, 11f, 2.336f, 11f, 2.75f)
                curveTo(11f, 3.164f, 10.664f, 3.5f, 10.25f, 3.5f)
                horizontalLineTo(5.25f)
                curveTo(4.284f, 3.5f, 3.5f, 4.284f, 3.5f, 5.25f)
                verticalLineTo(8.213f)
                curveTo(2.922f, 8.418f, 2.409f, 8.76f, 2f, 9.2f)
                verticalLineTo(5.25f)
                curveTo(2f, 3.455f, 3.455f, 2f, 5.25f, 2f)
                close()
                moveTo(15.787f, 20.5f)
                curveTo(15.582f, 21.078f, 15.24f, 21.591f, 14.8f, 22f)
                horizontalLineTo(18.75f)
                curveTo(20.545f, 22f, 22f, 20.545f, 22f, 18.75f)
                verticalLineTo(13.75f)
                curveTo(22f, 13.336f, 21.664f, 13f, 21.25f, 13f)
                curveTo(20.836f, 13f, 20.5f, 13.336f, 20.5f, 13.75f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.716f, 19.716f, 20.5f, 18.75f, 20.5f)
                horizontalLineTo(15.787f)
                close()
                moveTo(21.25f, 11f)
                curveTo(21.664f, 11f, 22f, 10.664f, 22f, 10.25f)
                verticalLineTo(5.25f)
                curveTo(22f, 3.455f, 20.545f, 2f, 18.75f, 2f)
                horizontalLineTo(13.75f)
                curveTo(13.336f, 2f, 13f, 2.336f, 13f, 2.75f)
                curveTo(13f, 3.164f, 13.336f, 3.5f, 13.75f, 3.5f)
                horizontalLineTo(18.75f)
                curveTo(19.716f, 3.5f, 20.5f, 4.284f, 20.5f, 5.25f)
                verticalLineTo(10.25f)
                curveTo(20.5f, 10.664f, 20.836f, 11f, 21.25f, 11f)
                close()
                moveTo(7f, 9f)
                horizontalLineTo(10f)
                verticalLineTo(12.5f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                close()
                moveTo(7f, 14f)
                horizontalLineTo(10f)
                verticalLineTo(17.5f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                close()
                moveTo(11.5f, 14f)
                verticalLineTo(17.5f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(11.5f)
                close()
                moveTo(7f, 19f)
                horizontalLineTo(10f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                close()
                moveTo(11.5f, 19f)
                verticalLineTo(22f)
                horizontalLineTo(12.25f)
                curveTo(13.769f, 22f, 15f, 20.769f, 15f, 19.25f)
                verticalLineTo(19f)
                horizontalLineTo(11.5f)
                close()
                moveTo(11.5f, 9f)
                verticalLineTo(12.5f)
                horizontalLineTo(15f)
                verticalLineTo(11.75f)
                curveTo(15f, 10.231f, 13.769f, 9f, 12.25f, 9f)
                horizontalLineTo(11.5f)
                close()
                moveTo(5.5f, 9f)
                horizontalLineTo(4.75f)
                curveTo(3.231f, 9f, 2f, 10.231f, 2f, 11.75f)
                verticalLineTo(12.5f)
                horizontalLineTo(5.5f)
                verticalLineTo(9f)
                close()
                moveTo(5.5f, 14f)
                horizontalLineTo(2f)
                verticalLineTo(17.5f)
                horizontalLineTo(5.5f)
                verticalLineTo(14f)
                close()
                moveTo(5.5f, 19f)
                horizontalLineTo(2f)
                verticalLineTo(19.25f)
                curveTo(2f, 20.769f, 3.231f, 22f, 4.75f, 22f)
                horizontalLineTo(5.5f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _ResizeTable!!
    }

@Suppress("ObjectPropertyName")
private var _ResizeTable: ImageVector? = null

@Preview
@Composable
private fun ResizeTablePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ResizeTable, contentDescription = null)
    }
}
