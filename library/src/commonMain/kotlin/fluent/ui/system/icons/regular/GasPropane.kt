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
 * GasPropane Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent travel & vehicle scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_gas_propane_20_regular.svg)
 * 
 * @return The [ImageVector] for the GasPropane icon.
 */
public val FluentIcons.Regular.GasPropane: ImageVector
    get() {
        if (_gasPropane != null) {
            return _gasPropane!!
        }
        _gasPropane = Builder(name = "GasPropane", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.5f, 2.0f)
                curveTo(14.776f, 2.0f, 15.0f, 2.224f, 15.0f, 2.5f)
                curveTo(15.0f, 2.776f, 14.776f, 3.0f, 14.5f, 3.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.171f)
                curveTo(15.165f, 6.583f, 16.0f, 7.694f, 16.0f, 9.0f)
                verticalLineTo(14.0f)
                curveTo(16.0f, 15.657f, 14.657f, 17.0f, 13.0f, 17.0f)
                horizontalLineTo(7.0f)
                curveTo(5.343f, 17.0f, 4.0f, 15.657f, 4.0f, 14.0f)
                verticalLineTo(9.0f)
                curveTo(4.0f, 7.694f, 4.835f, 6.586f, 6.0f, 6.174f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.5f)
                curveTo(5.224f, 3.0f, 5.0f, 2.776f, 5.0f, 2.5f)
                curveTo(5.0f, 2.224f, 5.224f, 2.0f, 5.5f, 2.0f)
                horizontalLineTo(14.5f)
                close()
                moveTo(5.0f, 12.0f)
                verticalLineTo(14.0f)
                curveTo(5.0f, 15.105f, 5.895f, 16.0f, 7.0f, 16.0f)
                horizontalLineTo(13.0f)
                curveTo(14.105f, 16.0f, 15.0f, 15.105f, 15.0f, 14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(7.0f, 7.0f)
                curveTo(5.895f, 7.0f, 5.0f, 7.895f, 5.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                curveTo(15.0f, 7.964f, 14.213f, 7.113f, 13.204f, 7.011f)
                lineTo(13.0f, 7.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(7.0f, 6.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                curveTo(8.724f, 5.0f, 8.5f, 4.776f, 8.5f, 4.5f)
                curveTo(8.5f, 4.224f, 8.724f, 4.0f, 9.0f, 4.0f)
                horizontalLineTo(11.0f)
                curveTo(11.276f, 4.0f, 11.5f, 4.224f, 11.5f, 4.5f)
                curveTo(11.5f, 4.776f, 11.276f, 5.0f, 11.0f, 5.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _gasPropane!!
    }

@Suppress("ObjectPropertyName")
private var _gasPropane: ImageVector? = null

@Preview
@Composable
private fun GasPropanePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.GasPropane, contentDescription = "GasPropane Icon")
    }
}

