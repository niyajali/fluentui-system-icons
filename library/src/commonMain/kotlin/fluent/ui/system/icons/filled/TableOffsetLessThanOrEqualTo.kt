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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.TableOffsetLessThanOrEqualTo: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.TableOffsetLessThanOrEqualTo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14f, 3f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
                verticalLineTo(8.5f)
                horizontalLineTo(14f)
                verticalLineTo(3f)
                close()
                moveTo(15.5f, 8.5f)
                horizontalLineTo(21f)
                verticalLineTo(6.25f)
                curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
                horizontalLineTo(15.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(10f, 10f)
                verticalLineTo(14f)
                horizontalLineTo(12.022f)
                curveTo(13.177f, 12.196f, 15.199f, 11f, 17.5f, 11f)
                curveTo(18.789f, 11f, 19.99f, 11.375f, 21f, 12.022f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                close()
                moveTo(3f, 15.5f)
                horizontalLineTo(11.314f)
                curveTo(11.11f, 16.13f, 11f, 16.802f, 11f, 17.5f)
                curveTo(11f, 18.789f, 11.375f, 19.99f, 12.022f, 21f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
                verticalLineTo(15.5f)
                close()
                moveTo(8.5f, 10f)
                horizontalLineTo(3f)
                verticalLineTo(14f)
                horizontalLineTo(8.5f)
                verticalLineTo(10f)
                close()
                moveTo(17.5f, 23f)
                curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
                curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                close()
                moveTo(15.5f, 20f)
                horizontalLineTo(19.5f)
                curveTo(19.776f, 20f, 20f, 20.224f, 20f, 20.5f)
                curveTo(20f, 20.776f, 19.776f, 21f, 19.5f, 21f)
                horizontalLineTo(15.5f)
                curveTo(15.224f, 21f, 15f, 20.776f, 15f, 20.5f)
                curveTo(15f, 20.224f, 15.224f, 20f, 15.5f, 20f)
                close()
                moveTo(18.89f, 14.188f)
                curveTo(19.063f, 14.403f, 19.028f, 14.718f, 18.812f, 14.89f)
                lineTo(16.8f, 16.5f)
                lineTo(18.812f, 18.11f)
                curveTo(19.028f, 18.282f, 19.063f, 18.597f, 18.89f, 18.812f)
                curveTo(18.718f, 19.028f, 18.403f, 19.063f, 18.188f, 18.89f)
                lineTo(15.688f, 16.89f)
                curveTo(15.569f, 16.795f, 15.5f, 16.652f, 15.5f, 16.5f)
                curveTo(15.5f, 16.348f, 15.569f, 16.205f, 15.688f, 16.11f)
                lineTo(18.188f, 14.11f)
                curveTo(18.403f, 13.937f, 18.718f, 13.972f, 18.89f, 14.188f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun TableOffsetLessThanOrEqualToPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TableOffsetLessThanOrEqualTo, contentDescription = null)
    }
}
