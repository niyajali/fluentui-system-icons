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
 * FilterAdd Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 20dp
 * - Keywords: fluent-icon, outlook, teams
 * - Description: Used to filter list.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_filter_add_20_filled.svg)
 * 
 * @return The [ImageVector] for the FilterAdd icon.
 */
public val FluentIcons.Filled.FilterAdd: ImageVector
    get() {
        if (_filterAdd != null) {
            return _filterAdd!!
        }
        _filterAdd = Builder(name = "FilterAdd", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 9.242f)
                curveTo(16.26f, 9.736f, 15.39f, 10.0f, 14.5f, 10.0f)
                curveTo(13.307f, 10.0f, 12.162f, 9.526f, 11.318f, 8.682f)
                curveTo(10.474f, 7.838f, 10.0f, 6.693f, 10.0f, 5.5f)
                curveTo(10.0f, 4.61f, 10.264f, 3.74f, 10.758f, 3.0f)
                curveTo(11.253f, 2.26f, 11.956f, 1.683f, 12.778f, 1.343f)
                curveTo(13.6f, 1.002f, 14.505f, 0.913f, 15.378f, 1.086f)
                curveTo(16.251f, 1.26f, 17.053f, 1.689f, 17.682f, 2.318f)
                curveTo(18.311f, 2.947f, 18.74f, 3.749f, 18.913f, 4.622f)
                curveTo(19.087f, 5.495f, 18.998f, 6.4f, 18.657f, 7.222f)
                curveTo(18.317f, 8.044f, 17.74f, 8.747f, 17.0f, 9.242f)
                close()
                moveTo(14.854f, 3.146f)
                curveTo(14.76f, 3.053f, 14.633f, 3.0f, 14.5f, 3.0f)
                curveTo(14.367f, 3.0f, 14.24f, 3.053f, 14.146f, 3.146f)
                curveTo(14.053f, 3.24f, 14.0f, 3.367f, 14.0f, 3.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(12.5f)
                curveTo(12.367f, 5.0f, 12.24f, 5.053f, 12.146f, 5.146f)
                curveTo(12.053f, 5.24f, 12.0f, 5.367f, 12.0f, 5.5f)
                curveTo(12.0f, 5.633f, 12.053f, 5.76f, 12.146f, 5.854f)
                curveTo(12.24f, 5.947f, 12.367f, 6.0f, 12.5f, 6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.5f)
                curveTo(14.0f, 7.633f, 14.053f, 7.76f, 14.146f, 7.854f)
                curveTo(14.24f, 7.947f, 14.367f, 8.0f, 14.5f, 8.0f)
                curveTo(14.633f, 8.0f, 14.76f, 7.947f, 14.854f, 7.854f)
                curveTo(14.947f, 7.76f, 15.0f, 7.633f, 15.0f, 7.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.5f)
                curveTo(16.633f, 6.0f, 16.76f, 5.947f, 16.854f, 5.854f)
                curveTo(16.947f, 5.76f, 17.0f, 5.633f, 17.0f, 5.5f)
                curveTo(17.0f, 5.367f, 16.947f, 5.24f, 16.854f, 5.146f)
                curveTo(16.76f, 5.053f, 16.633f, 5.0f, 16.5f, 5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.5f)
                curveTo(15.0f, 3.367f, 14.947f, 3.24f, 14.854f, 3.146f)
                close()
                moveTo(9.022f, 5.0f)
                curveTo(9.008f, 5.165f, 9.0f, 5.331f, 9.0f, 5.5f)
                curveTo(9.0f, 5.841f, 9.031f, 6.176f, 9.091f, 6.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 6.5f, 3.0f, 6.164f, 3.0f, 5.75f)
                curveTo(3.0f, 5.336f, 3.336f, 5.0f, 3.75f, 5.0f)
                horizontalLineTo(9.022f)
                close()
                moveTo(10.477f, 9.25f)
                curveTo(11.119f, 9.938f, 11.935f, 10.462f, 12.856f, 10.75f)
                horizontalLineTo(5.75f)
                curveTo(5.336f, 10.75f, 5.0f, 10.414f, 5.0f, 10.0f)
                curveTo(5.0f, 9.586f, 5.336f, 9.25f, 5.75f, 9.25f)
                horizontalLineTo(10.477f)
                close()
                moveTo(12.25f, 13.5f)
                curveTo(12.664f, 13.5f, 13.0f, 13.836f, 13.0f, 14.25f)
                curveTo(13.0f, 14.664f, 12.664f, 15.0f, 12.25f, 15.0f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 15.0f, 7.0f, 14.664f, 7.0f, 14.25f)
                curveTo(7.0f, 13.836f, 7.336f, 13.5f, 7.75f, 13.5f)
                horizontalLineTo(12.25f)
                close()
            }
        }
        .build()
        return _filterAdd!!
    }

@Suppress("ObjectPropertyName")
private var _filterAdd: ImageVector? = null

@Preview
@Composable
private fun FilterAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FilterAdd, contentDescription = "FilterAdd Icon")
    }
}

