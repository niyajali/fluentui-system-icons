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
 * TableSwitch Icon (24dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: fluent-icon, excel
 * - Description: Used to represent a data table.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_table_switch_24_regular.svg)
 * 
 * @return The [ImageVector] for the TableSwitch icon.
 */
public val FluentIcons.Regular.TableSwitch: ImageVector
    get() {
        if (_tableSwitch != null) {
            return _tableSwitch!!
        }
        _tableSwitch = Builder(name = "TableSwitch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.78f, 1.22f)
                curveTo(8.487f, 0.927f, 8.013f, 0.927f, 7.72f, 1.22f)
                curveTo(7.427f, 1.513f, 7.427f, 1.987f, 7.72f, 2.28f)
                lineTo(8.439f, 3.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3.0f, 3.0f, 4.455f, 3.0f, 6.25f)
                verticalLineTo(8.439f)
                lineTo(2.28f, 7.72f)
                curveTo(1.987f, 7.427f, 1.513f, 7.427f, 1.22f, 7.72f)
                curveTo(0.927f, 8.013f, 0.927f, 8.487f, 1.22f, 8.78f)
                lineTo(3.22f, 10.78f)
                curveTo(3.245f, 10.806f, 3.271f, 10.828f, 3.299f, 10.849f)
                curveTo(3.312f, 10.859f, 3.324f, 10.868f, 3.337f, 10.876f)
                curveTo(3.6f, 11.05f, 3.947f, 11.041f, 4.201f, 10.849f)
                curveTo(4.229f, 10.828f, 4.255f, 10.806f, 4.28f, 10.78f)
                lineTo(6.28f, 8.78f)
                curveTo(6.362f, 8.698f, 6.421f, 8.602f, 6.457f, 8.5f)
                curveTo(6.55f, 8.236f, 6.491f, 7.931f, 6.28f, 7.72f)
                curveTo(5.987f, 7.427f, 5.513f, 7.427f, 5.22f, 7.72f)
                lineTo(4.5f, 8.439f)
                verticalLineTo(6.25f)
                curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
                horizontalLineTo(8.439f)
                lineTo(7.72f, 5.22f)
                curveTo(7.427f, 5.513f, 7.427f, 5.987f, 7.72f, 6.28f)
                curveTo(7.931f, 6.491f, 8.236f, 6.55f, 8.5f, 6.457f)
                curveTo(8.5f, 6.457f, 8.5f, 6.457f, 8.5f, 6.457f)
                curveTo(8.602f, 6.421f, 8.699f, 6.362f, 8.78f, 6.28f)
                lineTo(10.78f, 4.28f)
                curveTo(11.073f, 3.987f, 11.073f, 3.513f, 10.78f, 3.22f)
                lineTo(8.78f, 1.22f)
                close()
                moveTo(11.832f, 3.0f)
                curveTo(12.056f, 3.473f, 12.056f, 4.027f, 11.832f, 4.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.475f)
                lineTo(9.487f, 6.987f)
                curveTo(9.209f, 7.265f, 8.861f, 7.43f, 8.5f, 7.482f)
                verticalLineTo(8.5f)
                horizontalLineTo(7.482f)
                curveTo(7.43f, 8.861f, 7.265f, 9.209f, 6.987f, 9.487f)
                lineTo(6.475f, 10.0f)
                horizontalLineTo(8.5f)
                lineTo(8.5f, 14.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(11.832f)
                curveTo(4.027f, 12.056f, 3.473f, 12.056f, 3.0f, 11.832f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.545f, 4.455f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21.0f, 21.0f, 19.545f, 21.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.455f, 19.545f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(11.832f)
                close()
                moveTo(10.0f, 14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                lineTo(14.0f, 14.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(15.5f, 14.0f)
                lineTo(15.5f, 10.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.5f)
                close()
                moveTo(14.0f, 15.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(14.0f)
                close()
                moveTo(15.5f, 19.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(17.75f)
                curveTo(19.5f, 18.716f, 18.716f, 19.5f, 17.75f, 19.5f)
                horizontalLineTo(15.5f)
                close()
                moveTo(15.5f, 8.5f)
                verticalLineTo(4.5f)
                horizontalLineTo(17.75f)
                curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
                verticalLineTo(8.5f)
                horizontalLineTo(15.5f)
                close()
                moveTo(4.5f, 15.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
                verticalLineTo(15.5f)
                close()
            }
        }
        .build()
        return _tableSwitch!!
    }

@Suppress("ObjectPropertyName")
private var _tableSwitch: ImageVector? = null

@Preview
@Composable
private fun TableSwitchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.TableSwitch, contentDescription = "TableSwitch Icon")
    }
}

