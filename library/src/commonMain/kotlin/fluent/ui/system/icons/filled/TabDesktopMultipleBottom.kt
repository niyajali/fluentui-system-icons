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

public val FluentIcons.Filled.TabDesktopMultipleBottom: ImageVector
    get() {
        if (_TabDesktopMultipleBottom != null) {
            return _TabDesktopMultipleBottom!!
        }
        _TabDesktopMultipleBottom = ImageVector.Builder(
            name = "Filled.TabDesktopMultipleBottom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.008f, 5f)
                curveTo(6.135f, 3.322f, 7.538f, 2f, 9.248f, 2f)
                horizontalLineTo(17.25f)
                curveTo(19.873f, 2f, 22f, 4.127f, 22f, 6.75f)
                verticalLineTo(14.75f)
                curveTo(22f, 16.461f, 20.678f, 17.863f, 19f, 17.99f)
                curveTo(18.999f, 17.991f, 18.999f, 17.99f, 18.998f, 17.99f)
                verticalLineTo(9.25f)
                curveTo(18.998f, 6.903f, 17.096f, 5f, 14.748f, 5f)
                horizontalLineTo(6.008f)
                close()
                moveTo(5.25f, 6f)
                curveTo(3.455f, 6f, 2f, 7.455f, 2f, 9.25f)
                verticalLineTo(16.5f)
                horizontalLineTo(9.25f)
                curveTo(10.493f, 16.5f, 11.5f, 17.507f, 11.5f, 18.75f)
                verticalLineTo(22f)
                horizontalLineTo(14.75f)
                curveTo(16.545f, 22f, 18f, 20.545f, 18f, 18.75f)
                verticalLineTo(9.25f)
                curveTo(18f, 7.455f, 16.545f, 6f, 14.75f, 6f)
                horizontalLineTo(5.25f)
                close()
                moveTo(2f, 18.75f)
                verticalLineTo(18f)
                horizontalLineTo(9.25f)
                curveTo(9.664f, 18f, 10f, 18.336f, 10f, 18.75f)
                verticalLineTo(22f)
                horizontalLineTo(5.25f)
                curveTo(3.455f, 22f, 2f, 20.545f, 2f, 18.75f)
                close()
            }
        }.build()

        return _TabDesktopMultipleBottom!!
    }

@Suppress("ObjectPropertyName")
private var _TabDesktopMultipleBottom: ImageVector? = null

@Preview
@Composable
private fun TabDesktopMultipleBottomPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TabDesktopMultipleBottom, contentDescription = null)
    }
}
