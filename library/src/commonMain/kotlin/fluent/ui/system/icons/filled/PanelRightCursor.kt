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

public val FluentUi.Filled.PanelRightCursor: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PanelRightCursor",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(18.75f, 4f)
            curveTo(20.545f, 4f, 22f, 5.455f, 22f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(22f, 17.165f, 21.922f, 17.562f, 21.78f, 17.927f)
            lineTo(16.054f, 11.578f)
            curveTo(15.657f, 11.137f, 15.071f, 10.935f, 14.5f, 11.019f)
            verticalLineTo(5.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 5.5f, 3.5f, 6.284f, 3.5f, 7.25f)
            verticalLineTo(16.75f)
            curveTo(3.5f, 17.716f, 4.284f, 18.5f, 5.25f, 18.5f)
            horizontalLineTo(13.002f)
            lineTo(13.001f, 20f)
            horizontalLineTo(5.25f)
            curveTo(3.455f, 20f, 2f, 18.545f, 2f, 16.75f)
            verticalLineTo(7.25f)
            curveTo(2f, 5.455f, 3.455f, 4f, 5.25f, 4f)
            horizontalLineTo(18.75f)
            close()
            moveTo(14.486f, 12.05f)
            curveTo(14.776f, 11.939f, 15.104f, 12.017f, 15.312f, 12.248f)
            lineTo(21.677f, 19.305f)
            curveTo(21.897f, 19.55f, 21.932f, 19.91f, 21.763f, 20.193f)
            curveTo(21.593f, 20.476f, 21.259f, 20.615f, 20.939f, 20.535f)
            lineTo(17.402f, 19.657f)
            lineTo(15.372f, 22.671f)
            curveTo(15.188f, 22.945f, 14.846f, 23.066f, 14.531f, 22.97f)
            curveTo(14.215f, 22.873f, 14f, 22.582f, 14f, 22.252f)
            lineTo(14.005f, 12.75f)
            curveTo(14.005f, 12.439f, 14.196f, 12.161f, 14.486f, 12.05f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PanelRightCursorPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PanelRightCursor, contentDescription = null)
    }
}
