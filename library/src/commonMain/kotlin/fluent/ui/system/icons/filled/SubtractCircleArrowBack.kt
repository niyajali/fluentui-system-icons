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

package fluent.ui.system.icons.filled

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
 * SubtractCircleArrowBack Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used in maximize/minimize & block scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_subtract_circle_arrow_back_20_filled.svg)
 * 
 * @return The [ImageVector] for the SubtractCircleArrowBack icon.
 */
public val FluentIcons.Filled.SubtractCircleArrowBack: ImageVector
    get() {
        if (_subtractCircleArrowBack != null) {
            return _subtractCircleArrowBack!!
        }
        _subtractCircleArrowBack = Builder(name = "SubtractCircleArrowBack", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.979f, 9.589f)
                curveTo(16.993f, 9.394f, 17.0f, 9.198f, 17.0f, 9.0f)
                curveTo(17.0f, 4.582f, 13.418f, 1.0f, 9.0f, 1.0f)
                curveTo(4.582f, 1.0f, 1.0f, 4.582f, 1.0f, 9.0f)
                curveTo(1.0f, 13.418f, 4.582f, 17.0f, 9.0f, 17.0f)
                curveTo(9.198f, 17.0f, 9.394f, 16.993f, 9.589f, 16.979f)
                curveTo(9.212f, 16.234f, 9.0f, 15.392f, 9.0f, 14.5f)
                curveTo(9.0f, 12.281f, 10.314f, 10.37f, 12.205f, 9.5f)
                horizontalLineTo(5.5f)
                curveTo(5.224f, 9.5f, 5.0f, 9.276f, 5.0f, 9.0f)
                curveTo(5.0f, 8.724f, 5.224f, 8.5f, 5.5f, 8.5f)
                horizontalLineTo(12.5f)
                curveTo(12.776f, 8.5f, 13.0f, 8.724f, 13.0f, 9.0f)
                curveTo(13.0f, 9.08f, 12.981f, 9.155f, 12.948f, 9.222f)
                curveTo(13.44f, 9.078f, 13.961f, 9.0f, 14.5f, 9.0f)
                curveTo(15.392f, 9.0f, 16.234f, 9.212f, 16.979f, 9.589f)
                close()
                moveTo(19.0f, 14.5f)
                curveTo(19.0f, 16.985f, 16.985f, 19.0f, 14.5f, 19.0f)
                curveTo(12.015f, 19.0f, 10.0f, 16.985f, 10.0f, 14.5f)
                curveTo(10.0f, 12.015f, 12.015f, 10.0f, 14.5f, 10.0f)
                curveTo(16.985f, 10.0f, 19.0f, 12.015f, 19.0f, 14.5f)
                close()
                moveTo(13.604f, 11.896f)
                curveTo(13.408f, 11.701f, 13.092f, 11.701f, 12.896f, 11.896f)
                lineTo(11.146f, 13.646f)
                curveTo(11.099f, 13.694f, 11.062f, 13.75f, 11.038f, 13.809f)
                curveTo(11.014f, 13.868f, 11.0f, 13.932f, 11.0f, 14.0f)
                curveTo(11.0f, 14.068f, 11.014f, 14.132f, 11.038f, 14.191f)
                curveTo(11.062f, 14.25f, 11.097f, 14.304f, 11.144f, 14.351f)
                lineTo(12.896f, 16.104f)
                curveTo(13.092f, 16.299f, 13.408f, 16.299f, 13.604f, 16.104f)
                curveTo(13.799f, 15.908f, 13.799f, 15.592f, 13.604f, 15.396f)
                lineTo(12.707f, 14.5f)
                horizontalLineTo(14.25f)
                curveTo(15.217f, 14.5f, 16.0f, 15.283f, 16.0f, 16.25f)
                verticalLineTo(16.5f)
                curveTo(16.0f, 16.776f, 16.224f, 17.0f, 16.5f, 17.0f)
                curveTo(16.776f, 17.0f, 17.0f, 16.776f, 17.0f, 16.5f)
                verticalLineTo(16.25f)
                curveTo(17.0f, 14.731f, 15.769f, 13.5f, 14.25f, 13.5f)
                horizontalLineTo(12.707f)
                lineTo(13.604f, 12.604f)
                curveTo(13.799f, 12.408f, 13.799f, 12.092f, 13.604f, 11.896f)
                close()
            }
        }
        .build()
        return _subtractCircleArrowBack!!
    }

@Suppress("ObjectPropertyName")
private var _subtractCircleArrowBack: ImageVector? = null

@Preview
@Composable
private fun SubtractCircleArrowBackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SubtractCircleArrowBack, contentDescription = "SubtractCircleArrowBack Icon")
    }
}

