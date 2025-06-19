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

public val FluentIcons.Filled.BuildingBank: ImageVector
    get() {
        if (_BuildingBank != null) {
            return _BuildingBank!!
        }
        _BuildingBank = ImageVector.Builder(
            name = "Filled.BuildingBank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.968f, 2.325f)
                curveTo(11.583f, 1.876f, 12.417f, 1.876f, 13.032f, 2.325f)
                lineTo(20.453f, 7.741f)
                curveTo(21.43f, 8.453f, 20.927f, 9.998f, 19.719f, 10f)
                horizontalLineTo(4.281f)
                curveTo(3.073f, 9.998f, 2.57f, 8.453f, 3.547f, 7.741f)
                lineTo(10.968f, 2.325f)
                close()
                moveTo(13f, 6.25f)
                curveTo(13f, 5.698f, 12.552f, 5.25f, 12f, 5.25f)
                curveTo(11.448f, 5.25f, 11f, 5.698f, 11f, 6.25f)
                curveTo(11f, 6.803f, 11.448f, 7.25f, 12f, 7.25f)
                curveTo(12.552f, 7.25f, 13f, 6.803f, 13f, 6.25f)
                close()
                moveTo(11.25f, 16f)
                horizontalLineTo(9.25f)
                verticalLineTo(11f)
                horizontalLineTo(11.25f)
                verticalLineTo(16f)
                close()
                moveTo(14.75f, 16f)
                horizontalLineTo(12.75f)
                verticalLineTo(11f)
                horizontalLineTo(14.75f)
                verticalLineTo(16f)
                close()
                moveTo(18.5f, 16f)
                horizontalLineTo(16.25f)
                verticalLineTo(11f)
                horizontalLineTo(18.5f)
                verticalLineTo(16f)
                close()
                moveTo(18.75f, 17f)
                horizontalLineTo(5.25f)
                curveTo(4.007f, 17f, 3f, 18.008f, 3f, 19.25f)
                verticalLineTo(19.75f)
                curveTo(3f, 20.164f, 3.336f, 20.5f, 3.75f, 20.5f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 20.5f, 21f, 20.164f, 21f, 19.75f)
                verticalLineTo(19.25f)
                curveTo(21f, 18.008f, 19.993f, 17f, 18.75f, 17f)
                close()
                moveTo(7.75f, 16f)
                horizontalLineTo(5.5f)
                verticalLineTo(11f)
                horizontalLineTo(7.75f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _BuildingBank!!
    }

@Suppress("ObjectPropertyName")
private var _BuildingBank: ImageVector? = null

@Preview
@Composable
private fun BuildingBankPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BuildingBank, contentDescription = null)
    }
}
