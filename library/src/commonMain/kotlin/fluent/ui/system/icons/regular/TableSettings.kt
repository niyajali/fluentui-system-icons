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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * TableSettings Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, excel
 * - Description: Used to represent a data table.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_table_settings_24_regular.svg)
 * 
 * @return The [ImageVector] for the TableSettings icon.
 */
public val FluentIcons.Regular.TableSettings: ImageVector
    get() {
        if (_tableSettings != null) {
            return _tableSettings!!
        }
        _tableSettings = Builder(name = "TableSettings", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.455f, 4.455f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 3.0f, 21.0f, 4.455f, 21.0f, 6.25f)
                verticalLineTo(12.022f)
                curveTo(20.537f, 11.725f, 20.034f, 11.486f, 19.5f, 11.314f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(11.314f)
                curveTo(14.967f, 11.486f, 14.463f, 11.725f, 14.0f, 12.022f)
                lineTo(14.0f, 10.0f)
                horizontalLineTo(10.0f)
                lineTo(10.0f, 14.0f)
                horizontalLineTo(12.022f)
                curveTo(11.725f, 14.463f, 11.486f, 14.967f, 11.314f, 15.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.5f)
                horizontalLineTo(11.314f)
                curveTo(11.486f, 20.034f, 11.725f, 20.537f, 12.022f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21.0f, 3.0f, 19.545f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.25f, 4.5f)
                curveTo(5.284f, 4.5f, 4.5f, 5.284f, 4.5f, 6.25f)
                verticalLineTo(8.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(4.5f, 10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.5f)
                lineTo(8.5f, 10.0f)
                horizontalLineTo(4.5f)
                close()
                moveTo(15.5f, 8.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(6.25f)
                curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
                horizontalLineTo(15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(14.0f, 4.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.5f)
                close()
                moveTo(4.5f, 15.5f)
                verticalLineTo(17.75f)
                curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(4.5f)
                close()
                moveTo(14.278f, 13.975f)
                curveTo(14.593f, 15.066f, 13.939f, 16.199f, 12.837f, 16.472f)
                lineTo(12.253f, 16.616f)
                curveTo(12.208f, 16.904f, 12.185f, 17.199f, 12.185f, 17.5f)
                curveTo(12.185f, 17.815f, 12.21f, 18.123f, 12.259f, 18.423f)
                lineTo(12.799f, 18.553f)
                curveTo(13.911f, 18.821f, 14.573f, 19.966f, 14.249f, 21.064f)
                lineTo(14.062f, 21.695f)
                curveTo(14.501f, 22.08f, 15.002f, 22.394f, 15.546f, 22.617f)
                lineTo(16.04f, 22.098f)
                curveTo(16.828f, 21.268f, 18.151f, 21.269f, 18.939f, 22.098f)
                lineTo(19.438f, 22.623f)
                curveTo(19.981f, 22.403f, 20.481f, 22.093f, 20.92f, 21.71f)
                lineTo(20.722f, 21.024f)
                curveTo(20.408f, 19.934f, 21.062f, 18.801f, 22.163f, 18.528f)
                lineTo(22.747f, 18.383f)
                curveTo(22.792f, 18.096f, 22.816f, 17.801f, 22.816f, 17.5f)
                curveTo(22.816f, 17.185f, 22.79f, 16.876f, 22.741f, 16.576f)
                lineTo(22.202f, 16.446f)
                curveTo(21.089f, 16.178f, 20.428f, 15.033f, 20.752f, 13.936f)
                lineTo(20.938f, 13.305f)
                curveTo(20.499f, 12.919f, 19.999f, 12.606f, 19.454f, 12.383f)
                lineTo(18.961f, 12.902f)
                curveTo(18.172f, 13.731f, 16.85f, 13.731f, 16.062f, 12.901f)
                lineTo(15.563f, 12.377f)
                curveTo(15.019f, 12.597f, 14.519f, 12.907f, 14.08f, 13.289f)
                lineTo(14.278f, 13.975f)
                close()
                moveTo(17.5f, 19.0f)
                curveTo(16.699f, 19.0f, 16.05f, 18.328f, 16.05f, 17.5f)
                curveTo(16.05f, 16.671f, 16.699f, 16.0f, 17.5f, 16.0f)
                curveTo(18.301f, 16.0f, 18.95f, 16.671f, 18.95f, 17.5f)
                curveTo(18.95f, 18.328f, 18.301f, 19.0f, 17.5f, 19.0f)
                close()
            }
        }
        .build()
        return _tableSettings!!
    }

@Suppress("ObjectPropertyName")
private var _tableSettings: ImageVector? = null

@Preview
@Composable
private fun TableSettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableSettings, contentDescription = "TableSettings Icon")
    }
}

