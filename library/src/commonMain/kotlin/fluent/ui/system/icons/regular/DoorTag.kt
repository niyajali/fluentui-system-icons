package fluent.ui.system.icons.regular

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

public val FluentIcons.Regular.DoorTag: ImageVector
    get() {
        if (_DoorTag != null) {
            return _DoorTag!!
        }
        _DoorTag = ImageVector.Builder(
            name = "Regular.DoorTag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9.75f, 17.5f)
                curveTo(9.336f, 17.5f, 9f, 17.836f, 9f, 18.25f)
                curveTo(9f, 18.664f, 9.336f, 19f, 9.75f, 19f)
                horizontalLineTo(14.25f)
                curveTo(14.664f, 19f, 15f, 18.664f, 15f, 18.25f)
                curveTo(15f, 17.836f, 14.664f, 17.5f, 14.25f, 17.5f)
                horizontalLineTo(9.75f)
                close()
                moveTo(10.799f, 7.101f)
                curveTo(11.076f, 6.732f, 11.511f, 6.5f, 12f, 6.5f)
                curveTo(12.828f, 6.5f, 13.5f, 7.172f, 13.5f, 8f)
                curveTo(13.5f, 8.828f, 12.828f, 9.5f, 12f, 9.5f)
                horizontalLineTo(8f)
                curveTo(6.895f, 9.5f, 6f, 10.395f, 6f, 11.5f)
                verticalLineTo(20f)
                curveTo(6f, 21.105f, 6.895f, 22f, 8f, 22f)
                horizontalLineTo(16f)
                curveTo(17.105f, 22f, 18f, 21.105f, 18f, 20f)
                verticalLineTo(8f)
                curveTo(18f, 4.686f, 15.314f, 2f, 12f, 2f)
                curveTo(10.036f, 2f, 8.292f, 2.946f, 7.201f, 4.398f)
                curveTo(6.455f, 5.392f, 6.655f, 6.802f, 7.648f, 7.548f)
                curveTo(8.642f, 8.295f, 10.052f, 8.095f, 10.799f, 7.101f)
                close()
                moveTo(12f, 5f)
                curveTo(11.022f, 5f, 10.15f, 5.468f, 9.6f, 6.2f)
                curveTo(9.351f, 6.531f, 8.881f, 6.598f, 8.549f, 6.349f)
                curveTo(8.218f, 6.1f, 8.152f, 5.63f, 8.4f, 5.299f)
                curveTo(9.221f, 4.208f, 10.528f, 3.5f, 12f, 3.5f)
                curveTo(14.485f, 3.5f, 16.5f, 5.515f, 16.5f, 8f)
                verticalLineTo(20f)
                curveTo(16.5f, 20.276f, 16.276f, 20.5f, 16f, 20.5f)
                horizontalLineTo(8f)
                curveTo(7.724f, 20.5f, 7.5f, 20.276f, 7.5f, 20f)
                verticalLineTo(11.5f)
                curveTo(7.5f, 11.224f, 7.724f, 11f, 8f, 11f)
                horizontalLineTo(12f)
                curveTo(13.657f, 11f, 15f, 9.657f, 15f, 8f)
                curveTo(15f, 6.343f, 13.657f, 5f, 12f, 5f)
                close()
            }
        }.build()

        return _DoorTag!!
    }

@Suppress("ObjectPropertyName")
private var _DoorTag: ImageVector? = null

@Preview
@Composable
private fun DoorTagPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DoorTag, contentDescription = null)
    }
}
