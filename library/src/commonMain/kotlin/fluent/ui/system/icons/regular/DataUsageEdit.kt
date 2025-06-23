/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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

public val FluentIcons.Regular.DataUsageEdit: ImageVector
    get() {
        if (_DataUsageEdit != null) {
            return _DataUsageEdit!!
        }
        _DataUsageEdit = ImageVector.Builder(
            name = "Regular.DataUsageEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20f, 4.746f)
                curveTo(20f, 3.227f, 18.769f, 1.996f, 17.25f, 1.996f)
                horizontalLineTo(4.75f)
                curveTo(3.231f, 1.996f, 2f, 3.227f, 2f, 4.746f)
                verticalLineTo(17.246f)
                curveTo(2f, 18.765f, 3.231f, 19.996f, 4.75f, 19.996f)
                horizontalLineTo(11.416f)
                lineTo(11.521f, 19.576f)
                curveTo(11.617f, 19.192f, 11.774f, 18.828f, 11.984f, 18.496f)
                horizontalLineTo(4.75f)
                curveTo(4.06f, 18.496f, 3.5f, 17.936f, 3.5f, 17.246f)
                verticalLineTo(4.746f)
                curveTo(3.5f, 4.056f, 4.06f, 3.496f, 4.75f, 3.496f)
                horizontalLineTo(17.25f)
                curveTo(17.94f, 3.496f, 18.5f, 4.056f, 18.5f, 4.746f)
                verticalLineTo(11.859f)
                curveTo(18.937f, 11.459f, 19.456f, 11.199f, 20f, 11.078f)
                verticalLineTo(4.746f)
                close()
                moveTo(16f, 14.354f)
                verticalLineTo(6.729f)
                lineTo(15.993f, 6.63f)
                curveTo(15.943f, 6.274f, 15.63f, 5.999f, 15.25f, 5.999f)
                curveTo(14.836f, 5.999f, 14.5f, 6.326f, 14.5f, 6.729f)
                verticalLineTo(15.27f)
                lineTo(14.507f, 15.369f)
                curveTo(14.524f, 15.494f, 14.574f, 15.609f, 14.649f, 15.706f)
                lineTo(16f, 14.354f)
                close()
                moveTo(7.493f, 8.645f)
                curveTo(7.443f, 8.28f, 7.13f, 7.999f, 6.75f, 7.999f)
                curveTo(6.336f, 7.999f, 6f, 8.334f, 6f, 8.746f)
                verticalLineTo(15.253f)
                lineTo(6.007f, 15.354f)
                curveTo(6.057f, 15.719f, 6.37f, 15.999f, 6.75f, 15.999f)
                curveTo(7.164f, 15.999f, 7.5f, 15.665f, 7.5f, 15.253f)
                verticalLineTo(8.746f)
                lineTo(7.493f, 8.645f)
                close()
                moveTo(11.707f, 11.617f)
                curveTo(11.655f, 11.263f, 11.346f, 10.993f, 10.975f, 10.996f)
                curveTo(10.571f, 11f, 10.246f, 11.328f, 10.25f, 11.73f)
                lineTo(10.285f, 15.277f)
                lineTo(10.293f, 15.375f)
                curveTo(10.345f, 15.729f, 10.654f, 16f, 11.025f, 15.996f)
                curveTo(11.429f, 15.992f, 11.754f, 15.664f, 11.75f, 15.263f)
                lineTo(11.715f, 11.715f)
                lineTo(11.707f, 11.617f)
                close()
                moveTo(19.1f, 12.669f)
                lineTo(13.197f, 18.571f)
                curveTo(12.853f, 18.916f, 12.609f, 19.347f, 12.491f, 19.819f)
                lineTo(12.033f, 21.65f)
                curveTo(11.834f, 22.446f, 12.556f, 23.167f, 13.352f, 22.968f)
                lineTo(15.182f, 22.51f)
                curveTo(15.655f, 22.392f, 16.086f, 22.148f, 16.43f, 21.804f)
                lineTo(22.332f, 15.901f)
                curveTo(23.225f, 15.009f, 23.225f, 13.562f, 22.332f, 12.669f)
                curveTo(21.44f, 11.776f, 19.993f, 11.776f, 19.1f, 12.669f)
                close()
            }
        }.build()

        return _DataUsageEdit!!
    }

@Suppress("ObjectPropertyName")
private var _DataUsageEdit: ImageVector? = null

@Preview
@Composable
private fun DataUsageEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DataUsageEdit, contentDescription = null)
    }
}
