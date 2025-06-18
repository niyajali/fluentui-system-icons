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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.TableCursor: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableCursor",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.5f, 21f)
            horizontalLineTo(14.001f)
            lineTo(14.003f, 16f)
            horizontalLineTo(9.5f)
            lineTo(9.5f, 21f)
            close()
            moveTo(21f, 14.5f)
            horizontalLineTo(19.69f)
            lineTo(17.054f, 11.578f)
            curveTo(16.773f, 11.266f, 16.398f, 11.074f, 16f, 11.017f)
            verticalLineTo(9.5f)
            horizontalLineTo(21f)
            verticalLineTo(14.5f)
            close()
            moveTo(14.5f, 9.5f)
            verticalLineTo(11.53f)
            curveTo(14.189f, 11.85f, 14.005f, 12.284f, 14.005f, 12.749f)
            lineTo(14.004f, 14.5f)
            horizontalLineTo(9.5f)
            verticalLineTo(9.5f)
            horizontalLineTo(14.5f)
            close()
            moveTo(21f, 8f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(16f)
            verticalLineTo(8f)
            horizontalLineTo(21f)
            close()
            moveTo(14.5f, 3f)
            horizontalLineTo(9.5f)
            verticalLineTo(8f)
            horizontalLineTo(14.5f)
            verticalLineTo(3f)
            close()
            moveTo(8f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(8f)
            horizontalLineTo(8f)
            lineTo(8f, 3f)
            close()
            moveTo(3f, 9.5f)
            verticalLineTo(14.5f)
            horizontalLineTo(8f)
            verticalLineTo(9.5f)
            horizontalLineTo(3f)
            close()
            moveTo(3f, 16f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(8f)
            lineTo(8f, 16f)
            horizontalLineTo(3f)
            close()
            moveTo(15.486f, 12.05f)
            curveTo(15.776f, 11.939f, 16.104f, 12.017f, 16.312f, 12.248f)
            lineTo(22.677f, 19.305f)
            curveTo(22.897f, 19.55f, 22.932f, 19.91f, 22.763f, 20.193f)
            curveTo(22.593f, 20.476f, 22.259f, 20.615f, 21.939f, 20.535f)
            lineTo(18.402f, 19.657f)
            lineTo(16.372f, 22.671f)
            curveTo(16.188f, 22.945f, 15.846f, 23.066f, 15.531f, 22.97f)
            curveTo(15.215f, 22.873f, 15f, 22.582f, 15f, 22.252f)
            lineTo(15.005f, 12.75f)
            curveTo(15.005f, 12.439f, 15.196f, 12.161f, 15.486f, 12.05f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TableCursorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TableCursor, contentDescription = null)
    }
}
