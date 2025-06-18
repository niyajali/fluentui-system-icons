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

public val FluentIcons.Filled.Question: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Question",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 4f)
            curveTo(9.238f, 4f, 7f, 6.238f, 7f, 9f)
            curveTo(7f, 9.552f, 7.448f, 10f, 8f, 10f)
            curveTo(8.552f, 10f, 9f, 9.552f, 9f, 9f)
            curveTo(9f, 7.342f, 10.342f, 6f, 12f, 6f)
            curveTo(13.658f, 6f, 15f, 7.342f, 15f, 9f)
            curveTo(15f, 9.816f, 14.801f, 10.295f, 14.562f, 10.629f)
            curveTo(14.3f, 10.994f, 13.937f, 11.267f, 13.434f, 11.613f)
            lineTo(13.318f, 11.692f)
            curveTo(12.871f, 11.998f, 12.295f, 12.391f, 11.849f, 12.939f)
            curveTo(11.322f, 13.587f, 11f, 14.406f, 11f, 15.5f)
            verticalLineTo(16f)
            curveTo(11f, 16.552f, 11.448f, 17f, 12f, 17f)
            curveTo(12.552f, 17f, 13f, 16.552f, 13f, 16f)
            verticalLineTo(15.5f)
            curveTo(13f, 14.844f, 13.178f, 14.476f, 13.401f, 14.201f)
            curveTo(13.657f, 13.887f, 14.003f, 13.649f, 14.514f, 13.298f)
            lineTo(14.566f, 13.262f)
            curveTo(15.063f, 12.92f, 15.7f, 12.475f, 16.188f, 11.793f)
            curveTo(16.699f, 11.08f, 17f, 10.184f, 17f, 9f)
            curveTo(17f, 6.238f, 14.762f, 4f, 12f, 4f)
            close()
            moveTo(12f, 21.25f)
            curveTo(12.69f, 21.25f, 13.25f, 20.69f, 13.25f, 20f)
            curveTo(13.25f, 19.31f, 12.69f, 18.75f, 12f, 18.75f)
            curveTo(11.31f, 18.75f, 10.75f, 19.31f, 10.75f, 20f)
            curveTo(10.75f, 20.69f, 11.31f, 21.25f, 12f, 21.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun QuestionPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Question, contentDescription = null)
    }
}
