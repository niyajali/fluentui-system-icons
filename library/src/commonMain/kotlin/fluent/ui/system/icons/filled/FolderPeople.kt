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

public val FluentIcons.Filled.FolderPeople: ImageVector
    get() {
        if (_FolderPeople != null) {
            return _FolderPeople!!
        }
        _FolderPeople = ImageVector.Builder(
            name = "Filled.FolderPeople",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(2f, 8f)
                verticalLineTo(6.25f)
                curveTo(2f, 4.455f, 3.455f, 3f, 5.25f, 3f)
                horizontalLineTo(8.129f)
                curveTo(8.725f, 3f, 9.298f, 3.237f, 9.72f, 3.659f)
                lineTo(11.25f, 5.189f)
                lineTo(8.659f, 7.78f)
                curveTo(8.518f, 7.921f, 8.328f, 8f, 8.129f, 8f)
                horizontalLineTo(2f)
                close()
                moveTo(2f, 9.5f)
                verticalLineTo(17.75f)
                curveTo(2f, 19.545f, 3.455f, 21f, 5.25f, 21f)
                horizontalLineTo(11.116f)
                curveTo(11.036f, 20.666f, 11f, 20.328f, 11f, 20f)
                curveTo(11f, 18.573f, 11.997f, 17.378f, 13.333f, 17.074f)
                curveTo(12.817f, 16.536f, 12.5f, 15.805f, 12.5f, 15f)
                curveTo(12.5f, 13.343f, 13.843f, 12f, 15.5f, 12f)
                curveTo(16.868f, 12f, 18.023f, 12.916f, 18.383f, 14.169f)
                curveTo(18.826f, 13.467f, 19.608f, 13f, 20.5f, 13f)
                curveTo(21.063f, 13f, 21.582f, 13.186f, 22f, 13.5f)
                verticalLineTo(8.75f)
                curveTo(22f, 6.955f, 20.545f, 5.5f, 18.75f, 5.5f)
                horizontalLineTo(13.061f)
                lineTo(9.72f, 8.841f)
                curveTo(9.298f, 9.263f, 8.725f, 9.5f, 8.129f, 9.5f)
                horizontalLineTo(2f)
                close()
                moveTo(15.5f, 17f)
                curveTo(16.605f, 17f, 17.5f, 16.105f, 17.5f, 15f)
                curveTo(17.5f, 13.895f, 16.605f, 13f, 15.5f, 13f)
                curveTo(14.395f, 13f, 13.5f, 13.895f, 13.5f, 15f)
                curveTo(13.5f, 16.105f, 14.395f, 17f, 15.5f, 17f)
                close()
                moveTo(15.5f, 23f)
                curveTo(18.067f, 23f, 19f, 21.479f, 19f, 20f)
                curveTo(19f, 18.895f, 18.105f, 18f, 17f, 18f)
                horizontalLineTo(14f)
                curveTo(12.895f, 18f, 12f, 18.895f, 12f, 20f)
                curveTo(12f, 21.479f, 12.933f, 23f, 15.5f, 23f)
                close()
                moveTo(19.507f, 21.978f)
                curveTo(19.663f, 21.993f, 19.827f, 22f, 20f, 22f)
                curveTo(22.2f, 22f, 23f, 20.784f, 23f, 19.6f)
                curveTo(23f, 18.716f, 22.284f, 18f, 21.4f, 18f)
                horizontalLineTo(19.236f)
                curveTo(19.711f, 18.531f, 20f, 19.232f, 20f, 20f)
                curveTo(20f, 20.656f, 19.856f, 21.35f, 19.507f, 21.978f)
                close()
                moveTo(22f, 15.5f)
                curveTo(22f, 16.328f, 21.328f, 17f, 20.5f, 17f)
                curveTo(19.672f, 17f, 19f, 16.328f, 19f, 15.5f)
                curveTo(19f, 14.672f, 19.672f, 14f, 20.5f, 14f)
                curveTo(21.328f, 14f, 22f, 14.672f, 22f, 15.5f)
                close()
            }
        }.build()

        return _FolderPeople!!
    }

@Suppress("ObjectPropertyName")
private var _FolderPeople: ImageVector? = null

@Preview
@Composable
private fun FolderPeoplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FolderPeople, contentDescription = null)
    }
}
