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

public val FluentIcons.Filled.Guardian: ImageVector
    get() {
        if (_Guardian != null) {
            return _Guardian!!
        }
        _Guardian = ImageVector.Builder(
            name = "Filled.Guardian",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.5f, 5f)
                curveTo(10.5f, 6.657f, 9.157f, 8f, 7.5f, 8f)
                curveTo(5.843f, 8f, 4.5f, 6.657f, 4.5f, 5f)
                curveTo(4.5f, 3.343f, 5.843f, 2f, 7.5f, 2f)
                curveTo(9.157f, 2f, 10.5f, 3.343f, 10.5f, 5f)
                close()
                moveTo(16.5f, 10f)
                curveTo(17.881f, 10f, 19f, 8.881f, 19f, 7.5f)
                curveTo(19f, 6.119f, 17.881f, 5f, 16.5f, 5f)
                curveTo(15.119f, 5f, 14f, 6.119f, 14f, 7.5f)
                curveTo(14f, 8.881f, 15.119f, 10f, 16.5f, 10f)
                close()
                moveTo(13.396f, 10.75f)
                curveTo(13.464f, 10.988f, 13.5f, 11.24f, 13.5f, 11.5f)
                verticalLineTo(14.5f)
                curveTo(13.5f, 14.673f, 13.478f, 14.84f, 13.437f, 15f)
                curveTo(13.215f, 15.863f, 12.432f, 16.5f, 11.5f, 16.5f)
                curveTo(11.327f, 16.5f, 11.16f, 16.478f, 11f, 16.437f)
                verticalLineTo(20f)
                curveTo(11f, 21.105f, 10.105f, 22f, 9f, 22f)
                curveTo(8.527f, 22f, 8.092f, 21.836f, 7.75f, 21.561f)
                curveTo(7.408f, 21.836f, 6.973f, 22f, 6.5f, 22f)
                curveTo(5.395f, 22f, 4.5f, 21.105f, 4.5f, 20f)
                verticalLineTo(16.437f)
                curveTo(4.34f, 16.478f, 4.173f, 16.5f, 4f, 16.5f)
                curveTo(2.895f, 16.5f, 2f, 15.605f, 2f, 14.5f)
                verticalLineTo(11.5f)
                curveTo(2f, 9.981f, 3.231f, 8.75f, 4.75f, 8.75f)
                horizontalLineTo(10.75f)
                curveTo(12.009f, 8.75f, 13.07f, 9.596f, 13.396f, 10.75f)
                close()
                moveTo(14.425f, 10.75f)
                horizontalLineTo(19.75f)
                curveTo(21.269f, 10.75f, 22.5f, 11.981f, 22.5f, 13.5f)
                verticalLineTo(15.25f)
                curveTo(22.5f, 16.355f, 21.605f, 17.25f, 20.5f, 17.25f)
                curveTo(20.327f, 17.25f, 20.16f, 17.228f, 20f, 17.187f)
                verticalLineTo(20f)
                curveTo(20f, 21.105f, 19.105f, 22f, 18f, 22f)
                curveTo(17.527f, 22f, 17.092f, 21.836f, 16.75f, 21.561f)
                curveTo(16.408f, 21.836f, 15.973f, 22f, 15.5f, 22f)
                curveTo(14.395f, 22f, 13.5f, 21.105f, 13.5f, 20f)
                verticalLineTo(16.736f)
                curveTo(14.114f, 16.187f, 14.5f, 15.389f, 14.5f, 14.5f)
                verticalLineTo(11.5f)
                curveTo(14.5f, 11.243f, 14.474f, 10.992f, 14.425f, 10.75f)
                close()
            }
        }.build()

        return _Guardian!!
    }

@Suppress("ObjectPropertyName")
private var _Guardian: ImageVector? = null

@Preview
@Composable
private fun GuardianPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Guardian, contentDescription = null)
    }
}
