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
 * SquareHintArrowBack Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent general UI, app tile, content or other general layouts
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_square_hint_arrow_back_20_filled.svg)
 * 
 * @return The [ImageVector] for the SquareHintArrowBack icon.
 */
public val FluentIcons.Filled.SquareHintArrowBack: ImageVector
    get() {
        if (_squareHintArrowBack != null) {
            return _squareHintArrowBack!!
        }
        _squareHintArrowBack = Builder(name = "SquareHintArrowBack", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.25f, 3.0f)
                curveTo(8.836f, 3.0f, 8.5f, 3.336f, 8.5f, 3.75f)
                curveTo(8.5f, 4.164f, 8.836f, 4.5f, 9.25f, 4.5f)
                horizontalLineTo(10.75f)
                curveTo(11.164f, 4.5f, 11.5f, 4.164f, 11.5f, 3.75f)
                curveTo(11.5f, 3.336f, 11.164f, 3.0f, 10.75f, 3.0f)
                horizontalLineTo(9.25f)
                close()
                moveTo(3.0f, 10.75f)
                curveTo(3.0f, 11.164f, 3.336f, 11.5f, 3.75f, 11.5f)
                curveTo(4.164f, 11.5f, 4.5f, 11.164f, 4.5f, 10.75f)
                lineTo(4.5f, 9.25f)
                curveTo(4.5f, 8.836f, 4.164f, 8.5f, 3.75f, 8.5f)
                curveTo(3.336f, 8.5f, 3.0f, 8.836f, 3.0f, 9.25f)
                verticalLineTo(10.75f)
                close()
                moveTo(7.5f, 16.25f)
                curveTo(7.5f, 15.836f, 7.836f, 15.5f, 8.25f, 15.5f)
                horizontalLineTo(9.091f)
                curveTo(9.188f, 16.031f, 9.362f, 16.535f, 9.6f, 17.0f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 17.0f, 7.5f, 16.664f, 7.5f, 16.25f)
                close()
                moveTo(15.5f, 9.091f)
                curveTo(16.031f, 9.188f, 16.535f, 9.362f, 17.0f, 9.6f)
                verticalLineTo(8.25f)
                curveTo(17.0f, 7.836f, 16.664f, 7.5f, 16.25f, 7.5f)
                curveTo(15.836f, 7.5f, 15.5f, 7.836f, 15.5f, 8.25f)
                verticalLineTo(9.091f)
                close()
                moveTo(6.0f, 3.75f)
                curveTo(6.0f, 3.336f, 5.664f, 3.0f, 5.25f, 3.0f)
                curveTo(4.007f, 3.0f, 3.0f, 4.007f, 3.0f, 5.25f)
                curveTo(3.0f, 5.664f, 3.336f, 6.0f, 3.75f, 6.0f)
                curveTo(4.164f, 6.0f, 4.5f, 5.664f, 4.5f, 5.25f)
                curveTo(4.5f, 4.836f, 4.836f, 4.5f, 5.25f, 4.5f)
                curveTo(5.664f, 4.5f, 6.0f, 4.164f, 6.0f, 3.75f)
                close()
                moveTo(5.25f, 17.0f)
                curveTo(5.664f, 17.0f, 6.0f, 16.664f, 6.0f, 16.25f)
                curveTo(6.0f, 15.836f, 5.664f, 15.5f, 5.25f, 15.5f)
                curveTo(4.836f, 15.5f, 4.5f, 15.164f, 4.5f, 14.75f)
                curveTo(4.5f, 14.336f, 4.164f, 14.0f, 3.75f, 14.0f)
                curveTo(3.336f, 14.0f, 3.0f, 14.336f, 3.0f, 14.75f)
                curveTo(3.0f, 15.993f, 4.007f, 17.0f, 5.25f, 17.0f)
                close()
                moveTo(14.0f, 3.75f)
                curveTo(14.0f, 3.336f, 14.336f, 3.0f, 14.75f, 3.0f)
                curveTo(15.993f, 3.0f, 17.0f, 4.007f, 17.0f, 5.25f)
                curveTo(17.0f, 5.664f, 16.664f, 6.0f, 16.25f, 6.0f)
                curveTo(15.836f, 6.0f, 15.5f, 5.664f, 15.5f, 5.25f)
                curveTo(15.5f, 4.836f, 15.164f, 4.5f, 14.75f, 4.5f)
                curveTo(14.336f, 4.5f, 14.0f, 4.164f, 14.0f, 3.75f)
                close()
                moveTo(14.5f, 19.0f)
                curveTo(16.985f, 19.0f, 19.0f, 16.985f, 19.0f, 14.5f)
                curveTo(19.0f, 12.015f, 16.985f, 10.0f, 14.5f, 10.0f)
                curveTo(12.015f, 10.0f, 10.0f, 12.015f, 10.0f, 14.5f)
                curveTo(10.0f, 16.985f, 12.015f, 19.0f, 14.5f, 19.0f)
                close()
                moveTo(13.604f, 12.604f)
                lineTo(12.707f, 13.5f)
                horizontalLineTo(14.25f)
                curveTo(15.769f, 13.5f, 17.0f, 14.731f, 17.0f, 16.25f)
                verticalLineTo(16.5f)
                curveTo(17.0f, 16.776f, 16.776f, 17.0f, 16.5f, 17.0f)
                curveTo(16.224f, 17.0f, 16.0f, 16.776f, 16.0f, 16.5f)
                verticalLineTo(16.25f)
                curveTo(16.0f, 15.283f, 15.217f, 14.5f, 14.25f, 14.5f)
                horizontalLineTo(12.707f)
                lineTo(13.604f, 15.396f)
                curveTo(13.799f, 15.592f, 13.799f, 15.908f, 13.604f, 16.104f)
                curveTo(13.408f, 16.299f, 13.092f, 16.299f, 12.896f, 16.104f)
                lineTo(11.144f, 14.351f)
                curveTo(11.097f, 14.304f, 11.062f, 14.25f, 11.038f, 14.191f)
                curveTo(11.014f, 14.132f, 11.0f, 14.068f, 11.0f, 14.0f)
                curveTo(11.0f, 13.932f, 11.014f, 13.868f, 11.038f, 13.809f)
                curveTo(11.062f, 13.75f, 11.099f, 13.694f, 11.146f, 13.646f)
                lineTo(12.896f, 11.896f)
                curveTo(13.092f, 11.701f, 13.408f, 11.701f, 13.604f, 11.896f)
                curveTo(13.799f, 12.092f, 13.799f, 12.408f, 13.604f, 12.604f)
                close()
            }
        }
        .build()
        return _squareHintArrowBack!!
    }

@Suppress("ObjectPropertyName")
private var _squareHintArrowBack: ImageVector? = null

@Preview
@Composable
private fun SquareHintArrowBackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SquareHintArrowBack, contentDescription = "SquareHintArrowBack Icon")
    }
}

