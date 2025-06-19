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

public val FluentIcons.Filled.CloudArchive: ImageVector
    get() {
        if (_CloudArchive != null) {
            return _CloudArchive!!
        }
        _CloudArchive = ImageVector.Builder(
            name = "Filled.CloudArchive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.08f, 9.019f)
                curveTo(6.548f, 6.172f, 9.02f, 4f, 12f, 4f)
                curveTo(14.98f, 4f, 17.452f, 6.172f, 17.92f, 9.019f)
                curveTo(19.695f, 9.184f, 21.171f, 10.379f, 21.744f, 12f)
                horizontalLineTo(13f)
                curveTo(11.895f, 12f, 11f, 12.895f, 11f, 14f)
                verticalLineTo(15f)
                curveTo(11f, 15.74f, 11.402f, 16.387f, 12f, 16.732f)
                verticalLineTo(18f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 18f, 2f, 15.985f, 2f, 13.5f)
                curveTo(2f, 11.156f, 3.792f, 9.231f, 6.08f, 9.019f)
                close()
                moveTo(13f, 13f)
                curveTo(12.448f, 13f, 12f, 13.448f, 12f, 14f)
                verticalLineTo(15f)
                curveTo(12f, 15.552f, 12.448f, 16f, 13f, 16f)
                horizontalLineTo(22f)
                curveTo(22.552f, 16f, 23f, 15.552f, 23f, 15f)
                verticalLineTo(14f)
                curveTo(23f, 13.448f, 22.552f, 13f, 22f, 13f)
                horizontalLineTo(13f)
                close()
                moveTo(22f, 17f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                curveTo(13f, 22.105f, 13.895f, 23f, 15f, 23f)
                horizontalLineTo(20f)
                curveTo(21.105f, 23f, 22f, 22.105f, 22f, 21f)
                verticalLineTo(17f)
                close()
                moveTo(15.5f, 18.5f)
                curveTo(15.5f, 18.224f, 15.724f, 18f, 16f, 18f)
                horizontalLineTo(19f)
                curveTo(19.276f, 18f, 19.5f, 18.224f, 19.5f, 18.5f)
                curveTo(19.5f, 18.776f, 19.276f, 19f, 19f, 19f)
                horizontalLineTo(16f)
                curveTo(15.724f, 19f, 15.5f, 18.776f, 15.5f, 18.5f)
                close()
            }
        }.build()

        return _CloudArchive!!
    }

@Suppress("ObjectPropertyName")
private var _CloudArchive: ImageVector? = null

@Preview
@Composable
private fun CloudArchivePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CloudArchive, contentDescription = null)
    }
}
